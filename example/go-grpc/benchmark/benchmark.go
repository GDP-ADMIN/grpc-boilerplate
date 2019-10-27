package main

import (
	"context"
	"encoding/json"
	"fmt"
	pb "gogrpc/book" //put file generated from proto file to $GOPATH/src/gogrpc/book
	"io/ioutil"
	"log"
	"net/http"
	"testing"

	"google.golang.org/grpc"
)

var client pb.BookServiceClient

func main() {
	var conn *grpc.ClientConn
	conn, err := grpc.Dial(":6565", grpc.WithInsecure())
	if err != nil {
		log.Fatalf("did not connect: %s", err)
	}
	defer conn.Close()
	client = pb.NewBookServiceClient(conn)

	br := testing.Benchmark(benchmarkFunction)
	fmt.Println(br)
}

func benchmarkFunction(b *testing.B) {
	for i := 0; i < b.N; i++ {
		callAPI()
	}
}

func callGrpc() {
	_, err := client.FindAll(context.Background(), &pb.Empty{})
	if err != nil {
		log.Fatalf("Error when calling FindAll: %s", err)
	}
}

type bookData struct {
	title    string
	author   string
	isbn     string
	category string
}

func callAPI() {
	response, err := http.Get("http://localhost:9090/books")
	if err != nil {
		fmt.Printf("The HTTP request failed with error %s\n", err)
	} else {
		data, _ := ioutil.ReadAll(response.Body)
		var book bookData
		json.Unmarshal(data, &book)
		fmt.Println(book.title)
	}
}
