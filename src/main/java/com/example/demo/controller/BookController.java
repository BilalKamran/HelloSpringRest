package com.example.demo.controller;
import com.example.demo.entity.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/book")
    public List<Book> getUsers() {

        return bookService.getBooks();
    }

    @GetMapping("/book/{id}")
    public Optional<Book> getUser(@PathVariable(value="id") int id) {

        return bookService.getBook(id);
    }

    @PostMapping("/book")
    public Book addBook(@RequestBody Book book){

        return bookService.saveBook(book);
    }

    @PutMapping("/book")
    public Book updateBook(@RequestBody Book book){

        return bookService.saveBook(book);
    }

    @DeleteMapping("/book/{id}")
    public int deleteBook(@PathVariable(value="id") int id){

        bookService.deleteBook(id);
        return id;
    }
}
