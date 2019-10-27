package com.demo.consumer.rpc;

import com.demo.consumer.book.vo.Book;
import com.muhtar.rpc.book.BookMessage;
import com.muhtar.rpc.book.BookServiceGrpc;
import com.muhtar.rpc.book.Empty;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class GrpcBookClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(GrpcBookClient.class);

    private BookServiceGrpc.BookServiceBlockingStub bookServiceBlockingStub;

    @Value("${grpc.host}")
    private String grpcHost;

    @Value("${grpc.port}")
    private int grpcPort;

    @PostConstruct
    private void init() {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress(grpcHost, grpcPort).usePlaintext().build();
        bookServiceBlockingStub = BookServiceGrpc.newBlockingStub(managedChannel);
    }

    public List<Book> getAllBooks() {
        return bookServiceBlockingStub.findAll(Empty.newBuilder().build())
                .getBookList()
                .stream()
                .map(Book::fromBookMessage)
                .collect(Collectors.toList());
    }

    public Book addNewBook(Book book) {
        BookMessage response = bookServiceBlockingStub.addBook(book.toBookMessage());
        return Book.fromBookMessage(response);
    }
}