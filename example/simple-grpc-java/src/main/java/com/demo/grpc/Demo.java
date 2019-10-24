package com.demo.grpc;

import com.demo.grpc.book.service.GrpcBookService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class Demo {

    public static int PORT = 6565;

    public static void main(String[] args) {
        Server server = ServerBuilder.forPort(PORT)
            .addService(new GrpcBookService())
            .build();
        try {
            server.start();
            System.out.println("Server has started on port " + PORT);
            server.awaitTermination();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

    }
}
