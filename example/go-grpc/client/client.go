package main

import (
	"context"
	pb "gogrpc/book"
	"io"
	"log"

	"google.golang.org/grpc"
)

func main() {
	conn, err := grpc.Dial(":6565", grpc.WithInsecure())
	if err != nil {
		log.Fatalf("did not connect: %s", err)
	}
	defer conn.Close()

	client := pb.NewBookServiceClient(conn)

	//response, err := client.FindAll(context.Background(), &pb.Empty{})

	stream, err := client.StreamAll(context.Background(), &pb.Empty{})

	if err != nil {
		log.Fatalf("Error when calling FindAll: %s", err)
	}

	i := 0
	for {
		response, err := stream.Recv()
		if err != nil {
			continue
		}

		if len(response.Book) == 0 || err == io.EOF {
			break
		}

		log.Printf("Page: %d \n", i)
		log.Printf("Response from server: %v \n", response)
		i++
	}
}
