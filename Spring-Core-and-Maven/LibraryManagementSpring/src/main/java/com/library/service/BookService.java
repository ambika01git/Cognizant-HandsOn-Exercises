//package com.library.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.library.repository.BookRepository;
//
//@Service
//public class BookService {
//
//    @Autowired
//    private BookRepository bookRepository;
//
//    public void service() {
//
//        System.out.println("BookService method called.");
//
//        bookRepository.display();
//    }
//
//}

package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;


    // Constructor Injection
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    public void service() {

        System.out.println("BookService method called.");

        bookRepository.display();

    }

}