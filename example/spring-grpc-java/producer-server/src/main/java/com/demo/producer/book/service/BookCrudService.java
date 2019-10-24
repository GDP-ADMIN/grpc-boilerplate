package com.demo.producer.book.service;

import com.demo.producer.book.entity.Book;
import com.demo.producer.book.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookCrudService {

    private final BookRepository bookRepository;

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public Book createOne(Book book) {
        return bookRepository.save(book);
    }
}
