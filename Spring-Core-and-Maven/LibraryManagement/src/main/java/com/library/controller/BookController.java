package com.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.library.entity.Book;
import com.library.service.BookService;


@RestController
@RequestMapping("/books")
public class BookController {


    @Autowired
    private BookService bookService;


    // Get all books
    @GetMapping
    public List<Book> getAllBooks() {

        return bookService.getAllBooks();

    }


    // Add a new book
    @PostMapping
    public Book addBook(@RequestBody Book book) {

        return bookService.addBook(book);

    }


    // Get book by id
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {

        return bookService.getBookById(id);

    }


    // Delete book
    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable Long id) {

        return bookService.deleteBook(id);

    }


    // Update book
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id,
                           @RequestBody Book book) {

        return bookService.updateBook(id, book);

    }

}