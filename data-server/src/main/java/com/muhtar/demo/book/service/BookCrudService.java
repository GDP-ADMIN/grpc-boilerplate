package com.muhtar.demo.book.service;

import com.muhtar.demo.book.entity.Book;
import com.muhtar.demo.book.exception.BookNotFoundException;

import java.util.List;
import java.util.Optional;

public interface BookCrudService {
    List<Book> readAll();
    Optional<Book> readOneById(Long id) throws BookNotFoundException;
    Book updateOneById(Long id, Book book);
    Book createOne(Book book);
    void deleteOneById(Long id);
}
