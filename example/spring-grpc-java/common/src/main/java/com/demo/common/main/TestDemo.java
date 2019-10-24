package com.demo.common.main;

import com.muhtar.rpc.book.BookMessage;
import com.muhtar.rpc.book.BookMessageList;
import com.muhtar.rpc.book.BookServiceGrpc;
import com.muhtar.rpc.book.Empty;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class TestDemo {

    private static final String  HOST = "localhost";
    private static final int PORT = 6565;

    public static void main(String[] args) {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress(HOST, PORT).usePlaintext().build();
        BookServiceGrpc.BookServiceBlockingStub bookServiceBlockingStub =
            BookServiceGrpc.newBlockingStub(managedChannel);

        BookMessageList bookMessageList = bookServiceBlockingStub.findAll(Empty.newBuilder().build());
        BookMessage bookMessage = bookMessageList.getBook(0);
        System.out.println(bookMessage);
    }
}
