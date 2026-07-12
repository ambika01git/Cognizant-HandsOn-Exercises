package com.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.entity.Book;
import com.library.exception.BookNotFoundException;
import com.library.repository.BookRepository;


@Service
public class BookServiceImpl implements BookService {


    @Autowired
    private BookRepository bookRepository;


    @Override
    public List<Book> getAllBooks() {

        return bookRepository.findAll();

    }


    @Override
    public Book getBookById(Long id) {

        return bookRepository.findById(id)
                .orElseThrow(() ->
                    new BookNotFoundException("Book not found with id: " + id)
                );

    }


    @Override
    public Book addBook(Book book) {

        return bookRepository.save(book);

    }


    @Override
    public Book updateBook(Long id, Book book) {

        Book existingBook = bookRepository.findById(id)
                .orElseThrow(() ->
                    new BookNotFoundException("Book not found with id: " + id)
                );


        existingBook.setTitle(book.getTitle());
        existingBook.setAuthor(book.getAuthor());

        return bookRepository.save(existingBook);

    }


    @Override
    public String deleteBook(Long id) {

        if(!bookRepository.existsById(id)) {

            throw new BookNotFoundException("Book not found with id: " + id);

        }

        bookRepository.deleteById(id);

        return "Book deleted successfully";

    }

}