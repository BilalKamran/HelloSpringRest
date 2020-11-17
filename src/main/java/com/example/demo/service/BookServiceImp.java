package com.example.demo.service;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImp extends AbstractServiceImp<Book, Integer> implements BookService{

    final BookRepository bookRepository;

    @Autowired
    public BookServiceImp(BookRepository bookRepository) {
        super(bookRepository);
        this.bookRepository = bookRepository;
    }
}
