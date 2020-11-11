package com.example.demo.controller;
import com.example.demo.entity.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController {

    final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getBooks() {

        return bookService.getBooks();
    }

    @GetMapping("/{id}")
    public Optional<Book> getBook(@PathVariable(value="id") int id) {

        return bookService.getBook(id);
    }

    @PostMapping
    public Book addBook(@Valid @RequestBody Book book){

        return bookService.saveBook(book);
    }

    @PutMapping
    public Book updateBook(@Valid @RequestBody Book book){

        return bookService.saveBook(book);
    }

    @DeleteMapping("/{id}")
    public int deleteBook(@PathVariable(value="id") int id){
        bookService.deleteBook(id);
        return id;
    }
}
