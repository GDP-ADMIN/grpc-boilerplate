package com.demo.producer.book.service;

import com.demo.producer.book.entity.Book;
import com.demo.producer.book.repository.BookRepository;
import com.muhtar.rpc.book.BookMessage;
import com.muhtar.rpc.book.BookMessageList;
import com.muhtar.rpc.book.BookServiceGrpc;
import com.muhtar.rpc.book.Empty;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import org.lognet.springboot.grpc.GRpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@GRpcService
public class GrpcBookService extends BookServiceGrpc.BookServiceImplBase {

    private final Logger LOGGER = LoggerFactory.getLogger(GrpcBookService.class);

    private final BookRepository bookRepository;

    public void findAll(Empty request, StreamObserver<BookMessageList> responseObserver) {
        LOGGER.info("receiver rpc call findAll");
        List<Book> books = bookRepository.findAll();
        Iterable<BookMessage> bookMessageIterator = books.stream()
                .map(Book::toBookMessage)
                .collect(Collectors.toList());
        BookMessageList bookMessageList = BookMessageList.newBuilder().addAllBook(bookMessageIterator).build();
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
        LOGGER.info("receiver rpc call addBook");
        Book book = bookRepository.save(Book.fromBookMessage(request));
        responseObserver.onNext(book.toBookMessage());
        responseObserver.onCompleted();
    }

    private Book generateDummyBook() {
        return Book.builder()
            .id(1L)
            .author("author")
            .title("title")
            .category("category")
            .isbn("isbn")
            .build();
    }
}
