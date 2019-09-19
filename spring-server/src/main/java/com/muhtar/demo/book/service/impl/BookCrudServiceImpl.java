package com.muhtar.demo.book.service.impl;

import com.muhtar.demo.book.entity.Book;
import com.muhtar.demo.book.repository.BookRepository;
import com.muhtar.demo.book.service.BookCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookCrudServiceImpl implements BookCrudService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> readAll() {
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> readOneById(Long id) {
        return bookRepository.findById(id);
    }

    @Override
    public Book updateOneById(Long id, Book book) {
        book.setId(id);
        return bookRepository.save(book);
    }

    @Override
    public Book createOne(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void deleteOneById(Long id) {
        bookRepository.deleteById(id);
    }
}
