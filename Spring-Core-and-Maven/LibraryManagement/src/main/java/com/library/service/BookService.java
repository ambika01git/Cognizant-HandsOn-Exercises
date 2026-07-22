package com.library.service;

import java.util.List;

import com.library.entity.Book;

public interface BookService {

    List<Book> getAllBooks();

    Book getBookById(Long id);

    Book addBook(Book book);

    Book updateBook(Long id, Book book);

    String deleteBook(Long id);

}