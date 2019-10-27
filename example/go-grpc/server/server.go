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
	pb.BookMessageList
	pb.BookMessage
}

func (s *bookServer) FindAll(ctx context.Context, empty *pb.Empty) (*pb.BookMessageList, error) {
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

	return &pb.BookMessageList{Book: bookMessages}, nil
}

func (s *bookServer) AddBook(ctx context.Context, bookMessage *pb.BookMessage) (*pb.BookMessage, error) {
	fmt.Println("receive add book")
	return bookMessage, nil
}

func main() {
	flag.Parse()
	lis, err := net.Listen("tcp", fmt.Sprintf("localhost:%d", *port))
	if err != nil {
		log.Fatalf("failed to listen: %v", err)
	}
	log.Println("Starting server localhost:", *port)
	server := &bookServer{}
	grpcServer := grpc.NewServer()
	pb.RegisterBookServiceServer(grpcServer, server)
	grpcServer.Serve(lis)
}
