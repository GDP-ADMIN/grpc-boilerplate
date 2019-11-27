package com.demo.grpc;

import com.demo.grpc.book.service.GrpcBookService;
import com.demo.grpc.interceptor.MyInterceptor;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.ServerInterceptors;

import java.io.IOException;

public class Demo {

    private static int PORT = 6565;

    public static void main(String[] args) {
        Server server = ServerBuilder.forPort(PORT)
            .addService(ServerInterceptors.intercept(
                    new GrpcBookService(),
                    new MyInterceptor()
            )).build();
        try {
            server.start();
            System.out.println("Server has started on port " + PORT);
            server.awaitTermination();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

    }
}
