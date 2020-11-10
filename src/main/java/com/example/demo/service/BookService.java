package com.example.demo.service;

import com.example.demo.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface BookService {
    List<Book> getBooks();

    Optional<Book> getBook(int id);

    Book saveBook(Book book);

    void deleteBook(int id);

}
