package main

import (
	"context"
	"flag"
	"fmt"
	pb "gogrpc/book"
	"log"
	"net"

	"google.golang.org/grpc"
)

var (
	port = flag.Int("port", 6565, "The server port")
)

type bookServer struct {
	pb.UnimplementedBookServiceServer
}

func (s *bookServer) FindAll(ctx context.Context, empty *pb.Empty) (*pb.BookMessageList, error) {
	return createDummyBookList(), nil
}

func (s *bookServer) AddBook(ctx context.Context, bookMessage *pb.BookMessage) (*pb.BookMessage, error) {
	fmt.Println("receive add book")
	return bookMessage, nil
}

func (s *bookServer) StreamAll(req *pb.Empty, srv pb.BookService_StreamAllServer) error {

	for i := 1; i <= 5; i++ {
		if err := srv.Send(createDummyBookList()); err != nil {
			return err
		}
	}
	return nil
}

func createDummyBookList() *pb.BookMessageList {
	var bookMessages = []*pb.BookMessage{
		&pb.BookMessage{
			Title:    "Captain america",
			Author:   "Stan Lee",
			Isbn:     "1234567800",
			Category: "comic",
		},
		&pb.BookMessage{
			Title:    "Iron Man",
			Author:   "Stan Lee",
			Isbn:     "1234567800",
			Category: "comic",
		},
	}

	return &pb.BookMessageList{Book: bookMessages}
}

func main() {
	flag.Parse()
	lis, err := net.Listen("tcp", fmt.Sprintf("0.0.0.0:%d", *port))
	if err != nil {
		log.Fatalf("failed to listen: %v", err)
	}
	log.Println("Starting server localhost:", *port)
	server := &bookServer{}
	grpcServer := grpc.NewServer()
	pb.RegisterBookServiceServer(grpcServer, server)
	grpcServer.Serve(lis)
}
