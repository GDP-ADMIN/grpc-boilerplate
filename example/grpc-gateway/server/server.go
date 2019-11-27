package main

import (
	"context"
	"flag"
	"fmt"
	pb "gogrpc/employee"
	"log"
	"net"
	"net/http"

	"github.com/golang/protobuf/ptypes/empty"
	"github.com/grpc-ecosystem/grpc-gateway/runtime"
	"google.golang.org/grpc"
	"google.golang.org/grpc/codes"
	"google.golang.org/grpc/status"
)

type employeeServiceServer struct {
	*pb.UnimplementedEmployeeServiceServer
}

func (s *employeeServiceServer) FetchAll(ctx context.Context, req *empty.Empty) (*pb.EmployeeList, error) {
	var employees = []*pb.Employee{
		createDummyEmployee("Muhtar", "0821232322", 1),
	}
	return &pb.EmployeeList{EmployeeList: employees}, nil
}
func (s *employeeServiceServer) StreamAll(ctx context.Context, req *empty.Empty) (*pb.Employee, error) {
	return nil, status.Errorf(codes.Unimplemented, "method StreamAll not implemented")
}

func createDummyEmployee(name string, phoneNumber string, id int32) *pb.Employee {
	var phoneNumbers = []*pb.PhoneNumber{
		&pb.PhoneNumber{
			Type:   pb.PhoneType_MOBILE,
			Number: phoneNumber,
		},
	}

	return &pb.Employee{
		Name:  name,
		Id:    id,
		Phone: phoneNumbers,
	}
}

var (
	port = flag.Int("port", 9123, "The server port")
)

func runHTTP(grpcAddress string) error {
	ctx := context.Background()
	ctx, cancel := context.WithCancel(ctx)
	defer cancel()

	mux := runtime.NewServeMux()
	opts := []grpc.DialOption{grpc.WithInsecure()}
	err := pb.RegisterEmployeeServiceHandlerFromEndpoint(ctx, mux, grpcAddress, opts)
	if err != nil {
		return err
	}
	log.Println("Starting HTTP server localhost:8081")
	return http.ListenAndServe(":8081", mux)
}

func runGrpc(grpcAddress string) {
	lis, err := net.Listen("tcp", grpcAddress)
	if err != nil {
		log.Fatalf("failed to listen: %v", err)
	}
	defer lis.Close()

	log.Println("Starting grpc server localhost:", *port)
	server := &employeeServiceServer{}
	grpcServer := grpc.NewServer()
	pb.RegisterEmployeeServiceServer(grpcServer, server)
	grpcServer.Serve(lis)
}

func main() {
	fmt.Println("Service started")
	flag.Parse()
	grpcAddress := fmt.Sprintf("0.0.0.0:%d", *port)
	go runGrpc(grpcAddress)
	runHTTP(grpcAddress)
}
