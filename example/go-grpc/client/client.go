package main

import (
	"context"
	pb "gogrpc/book" //put file generated from proto file to $GOPATH/src/gogrpc/book
	"log"

	"google.golang.org/grpc"
)

func main() {
	var conn *grpc.ClientConn
	conn, err := grpc.Dial(":6565", grpc.WithInsecure())
	if err != nil {
		log.Fatalf("did not connect: %s", err)
	}
	defer conn.Close()

	client := pb.NewBookServiceClient(conn)
	response, err := client.FindAll(context.Background(), &pb.Empty{})
	if err != nil {
		log.Fatalf("Error when calling FindAll: %s", err)
	}
	log.Printf("Response from server: %v", response)
}
