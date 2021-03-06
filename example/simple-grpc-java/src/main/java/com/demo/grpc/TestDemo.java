package com.demo.grpc;

import com.example.rpc.book.BookMessage;
import com.example.rpc.book.BookMessageList;
import com.example.rpc.book.BookServiceGrpc;
import com.google.protobuf.Empty;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

public class TestDemo {

    private static final String  HOST = "localhost";
    private static final int PORT = 6565;

    public static void main(String[] args) {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress(HOST, PORT).usePlaintext().build();
        BookServiceGrpc.BookServiceBlockingStub bookServiceBlockingStub =
            BookServiceGrpc.newBlockingStub(managedChannel);
        try {
            BookMessageList bookMessageList = bookServiceBlockingStub.findAll(Empty.newBuilder().build());
            BookMessage bookMessage = bookMessageList.getBook(0);
            System.out.println(bookMessage);
        } catch (StatusRuntimeException e) {
            System.out.println("error: " + e.toString());
        }
    }
}
