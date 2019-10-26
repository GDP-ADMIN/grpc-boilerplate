package com.demo.producer.book.controller;

import com.demo.producer.book.entity.Book;
import com.demo.producer.book.service.BookCrudService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@RestController(value = "/books")
public class BookController {

    private final BookCrudService bookCrudService;

    @GetMapping
    public List<Book> getAllBooks()
    {
        return bookCrudService.findAll();
    }

    @PostMapping
    public Book addBook(@Valid @RequestBody Book book)
    {
        return bookCrudService.createOne(book);
    }
}
