package com.example.demo.book;

import com.example.demo.book.service.BookGrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class BookController {
    @Autowired
    private BookGrpcClient bookGrpcClient;

    @GetMapping("/all-books")
    public List<Book> allBooks()
    {
        return bookGrpcClient.readAllBooks();
    }

    @PostMapping("/add-book")
    public Book addBook(@RequestBody Book book)
    {
        return bookGrpcClient.addBook(book);
    }
}
