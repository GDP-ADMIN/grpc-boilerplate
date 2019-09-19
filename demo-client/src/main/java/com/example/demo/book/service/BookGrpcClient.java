package com.example.demo.book.service;

import com.example.demo.book.Book;
import com.muhtar.rpc.book.BookMessage;
import com.muhtar.rpc.book.BookMessageList;
import com.muhtar.rpc.book.BookshelfServiceGrpc;
import com.muhtar.rpc.book.Empty;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class BookGrpcClient {
    private static final String  HOST = "localhost";
    private static final int PORT = 6565;

    private BookshelfServiceGrpc.BookshelfServiceBlockingStub bookshelfServiceBlockingStub;

    @PostConstruct
    private void init()
    {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress(HOST, PORT).usePlaintext().build();
        bookshelfServiceBlockingStub = BookshelfServiceGrpc.newBlockingStub(managedChannel);
    }

    public Book addBook(Book book)
    {
        BookMessage bookMessage = BookMessage.newBuilder()
                .setTitle(book.getTitle())
                .setAuthor(book.getAuthor())
                .setIsbn(book.getIsbn())
                .build();
        BookMessage result = bookshelfServiceBlockingStub.addBook(bookMessage);
        return  new Book(result.getTitle(), result.getAuthor(), result.getIsbn());
    }

    public List<Book> readAllBooks()
    {
        BookMessageList result = bookshelfServiceBlockingStub.readAll(Empty.newBuilder().build());
        return result.getBookList()
                .stream()
                .map(bookMessage -> new Book(bookMessage.getTitle(), bookMessage.getAuthor(), bookMessage.getIsbn()))
                .collect(Collectors.toList());
    }
}
