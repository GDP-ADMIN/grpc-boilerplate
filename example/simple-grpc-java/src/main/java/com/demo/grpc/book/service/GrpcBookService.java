package com.demo.grpc.book.service;

import com.demo.grpc.book.entity.Book;
import com.muhtar.rpc.book.BookMessage;
import com.muhtar.rpc.book.BookMessageList;
import com.muhtar.rpc.book.BookServiceGrpc;
import com.muhtar.rpc.book.Empty;
import io.grpc.stub.StreamObserver;

public class GrpcBookService extends BookServiceGrpc.BookServiceImplBase {

    public void findAll(Empty request, StreamObserver<BookMessageList> responseObserver) {
        BookMessage bookMessage = generateDummyBook().toBookMessage();
        BookMessageList bookMessageList = BookMessageList.newBuilder().addBook(bookMessage).build();
        responseObserver.onNext(bookMessageList);
        responseObserver.onCompleted();
    }

    public void findBookByQuery(BookMessage request, StreamObserver<BookMessageList> responseObserver) {
        BookMessage bookMessage = generateDummyBook().toBookMessage();
        BookMessageList bookMessageList = BookMessageList.newBuilder().addBook(bookMessage).build();
        responseObserver.onNext(bookMessageList);
        responseObserver.onCompleted();
    }

    public void addBook(BookMessage request, StreamObserver<BookMessage> responseObserver) {
        responseObserver.onNext(generateDummyBook().toBookMessage());
        responseObserver.onCompleted();
    }

    private Book generateDummyBook() {
        return Book.builder()
            .id("id")
            .author("author")
            .title("title")
            .category("category")
            .isbn("isbn")
            .build();
    }
}
