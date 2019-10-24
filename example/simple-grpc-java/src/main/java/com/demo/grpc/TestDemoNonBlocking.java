package com.demo.grpc;

import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.muhtar.rpc.book.BookMessageList;
import com.muhtar.rpc.book.BookServiceGrpc;
import com.muhtar.rpc.book.Empty;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

import java.util.concurrent.ExecutionException;

public class TestDemoNonBlocking {
    private static final String  HOST = "localhost";
    private static final int PORT = 6565;

    public static void main(String[] args) {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress(HOST, PORT).usePlaintext().build();
        BookServiceGrpc.BookServiceFutureStub bookServiceFutureStub =
            BookServiceGrpc.newFutureStub(managedChannel);

        ListenableFuture<BookMessageList> future = bookServiceFutureStub.findAll(Empty.newBuilder().build());

        Futures.addCallback(future, new FutureCallback<BookMessageList>() {
            @Override
            public void onSuccess(@NullableDecl BookMessageList result) {
                assert result != null;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("futures: " + result.getBook(0).toString());
            }

            @Override
            public void onFailure(Throwable t) {
                t.printStackTrace();
            }
        }, MoreExecutors.directExecutor());

        System.out.println("finish");

        try {
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
