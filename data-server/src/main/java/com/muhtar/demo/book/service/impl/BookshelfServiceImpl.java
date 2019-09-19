package com.muhtar.demo.book.service.impl;

import com.muhtar.demo.book.entity.Book;
import com.muhtar.demo.book.service.BookCrudService;
import com.muhtar.rpc.book.*;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@GRpcService
public class BookshelfServiceImpl extends BookshelfServiceGrpc.BookshelfServiceImplBase {
    private final Logger LOGGER = LoggerFactory.getLogger(BookshelfServiceImpl.class);

    @Autowired
    private BookCrudService bookCrudService;

    public void readAll(Empty request, StreamObserver<BookMessageList> responseObserver)
    {
        LOGGER.info("request {}", request);
        List<Book> books = bookCrudService.readAll();
        BookMessageList.Builder bookListBuilder = BookMessageList.newBuilder();
        for (Book book : books) {
            BookMessage bookMessage = BookMessage
                    .newBuilder()
                    .setAuthor(book.getAuthor())
                    .setTitle(book.getTitle())
                    .setIsbn(book.getIsbn())
                    .build();
            bookListBuilder.addBook(bookMessage);
        }
        BookMessageList bookMessageList = bookListBuilder.build();
        responseObserver.onNext(bookMessageList);
        LOGGER.info("response {}", bookMessageList);
        responseObserver.onCompleted();
    }

    public void addBook(BookMessage request, StreamObserver<BookMessage> responseObserver)
    {
        LOGGER.info("request {}", request);
        Book book = new Book();
        book.setTitle(request.getTitle());
        book.setAuthor(request.getAuthor());
        book.setIsbn(request.getIsbn());
        book = bookCrudService.createOne(book);

        BookMessage bookMessage = BookMessage
                .newBuilder()
                .setAuthor(book.getAuthor())
                .setTitle(book.getTitle())
                .setIsbn(book.getIsbn())
                .build();
        responseObserver.onNext(bookMessage);
        LOGGER.info("response {}", bookMessage);
        responseObserver.onCompleted();
    }
}
