package main

import (
	"context"
	pb "gogrpc/employee"
	"log"

	"github.com/golang/protobuf/ptypes/empty"
	"google.golang.org/grpc"
)

func main() {
	conn, err := grpc.Dial("localhost:9123", grpc.WithInsecure())
	if err != nil {
		log.Fatalf("did not connect: %s", err)
	}
	defer conn.Close()

	client := pb.NewEmployeeServiceClient(conn)
	result, err := client.FetchAll(context.Background(), &empty.Empty{})

	if err != nil {
		log.Fatalf("error %s", err)
	} else {
		log.Printf("Result %s", result)
	}
}
