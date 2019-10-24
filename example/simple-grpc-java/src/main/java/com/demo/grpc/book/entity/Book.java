package com.demo.grpc.book.entity;

import com.muhtar.rpc.book.BookMessage;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    private String id;
    private String title;
    private String author;
    private String isbn;
    private String category;

    Book(String id, String title, String author, String isbn, String category) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.category = category;
    }

    public static Book fromBookMessage(BookMessage bookMessage) {
        return Book.builder()
            .title(bookMessage.getTitle())
            .author(bookMessage.getAuthor())
            .isbn(bookMessage.getIsbn())
            .category(bookMessage.getCategory())
            .build();
    }

    public static BookBuilder builder() {
        return new BookBuilder();
    }

    public BookMessage toBookMessage() {
        return BookMessage.newBuilder()
            .setTitle(title)
            .setAuthor(author)
            .setIsbn(isbn)
            .setCategory(category)
            .build();
    }

    public static class BookBuilder {

        private String id;
        private String title;
        private String author;
        private String isbn;
        private String category;

        BookBuilder() {
        }

        public BookBuilder id(String id) {
            this.id = id;
            return this;
        }

        public BookBuilder title(String title) {
            this.title = title;
            return this;
        }

        public BookBuilder author(String author) {
            this.author = author;
            return this;
        }

        public BookBuilder isbn(String isbn) {
            this.isbn = isbn;
            return this;
        }

        public BookBuilder category(String category) {
            this.category = category;
            return this;
        }

        public Book build() {
            return new Book(id, title, author, isbn, category);
        }

        public String toString() {
            return "Book.BookBuilder(id=" + this.id + ", title=" + this.title + ", author=" + this.author + ", isbn="
                + this.isbn + ", category=" + this.category + ")";
        }
    }
}
