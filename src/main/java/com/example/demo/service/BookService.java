package com.example.demo.service;

import com.example.demo.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    List<Book> getBooks();

    Book saveBook(Book book);
}
