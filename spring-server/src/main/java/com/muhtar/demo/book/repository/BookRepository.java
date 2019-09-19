package com.muhtar.demo.book.repository;

import com.muhtar.demo.book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository <Book, Long> {
}
