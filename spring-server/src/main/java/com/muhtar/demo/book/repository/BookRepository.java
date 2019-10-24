package com.muhtar.demo.book.repository;

import com.muhtar.demo.book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository <Book, Long> {
    List<Book> findByAuthor(String author);
}
