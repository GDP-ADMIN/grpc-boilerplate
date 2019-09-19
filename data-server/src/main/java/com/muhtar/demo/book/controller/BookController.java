package com.muhtar.demo.book.controller;

import com.muhtar.demo.book.entity.Book;
import com.muhtar.demo.book.exception.BookNotFoundException;
import com.muhtar.demo.book.service.BookCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookCrudService bookCrudService;

    @GetMapping(value = "/books")
    public List<Book> getAllBooks()
    {
        return bookCrudService.readAll();
    }

    @PostMapping(value = "/books")
    public Book addBook(@Valid @RequestBody Book book)
    {
        return bookCrudService.createOne(book);
    }

    @GetMapping(value = "books/{id}")
    public Book getBook(@PathVariable Long id) throws BookNotFoundException {
        return bookCrudService.readOneById(id).orElseThrow(BookNotFoundException::new);
    }
}
