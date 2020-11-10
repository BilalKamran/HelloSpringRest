package com.example.demo.controller;
import com.example.demo.entity.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/book")
    public List<Book> getUsers() {

        return bookService.getBooks();
    }

    @PostMapping("/book")
    public Book addUser(@RequestBody Book book){

        book = bookService.saveBook(book);

        return book;
    }

}
