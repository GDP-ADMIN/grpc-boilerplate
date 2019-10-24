package com.demo.producer.book.controller;

import com.demo.producer.book.entity.Book;
import com.demo.producer.book.service.BookCrudService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class BookController {

    private final BookCrudService bookCrudService;

    @GetMapping(value = "/books")
    public List<Book> getAllBooks()
    {
        return bookCrudService.findAll();
    }

    @PostMapping(value = "/books")
    public Book addBook(@Valid @RequestBody Book book)
    {
        return bookCrudService.createOne(book);
    }
}
