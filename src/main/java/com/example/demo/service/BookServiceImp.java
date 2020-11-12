package com.example.demo.service;

import com.example.demo.payload.BookPayload;
import com.example.demo.repository.BookRepository;
import com.example.demo.entity.Book;
import com.example.demo.response.BookResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServiceImp implements BookService{

    final BookRepository bookRepository;

    @Autowired
    public BookServiceImp(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<BookResponse> getBooks() {
        return bookRepository.findAll().stream()
                .map(book -> new BookResponse(book))
                .collect(Collectors.toList());
    }

    @Override
    public BookResponse getBook(Integer id) {
        return new BookResponse(bookRepository.findById(id).get());
    }

    @Override
    public BookResponse addBook(BookPayload bookPayload) {
        return new BookResponse(bookRepository.save(new Book(bookPayload)));
    }

    @Override
    public BookResponse updateBook(Integer id, BookPayload bookPayload) {
        return new BookResponse(bookRepository.save(new Book(id, bookPayload)));
    }

    @Override
    public Integer deleteBook(Integer id) {
        bookRepository.deleteById(id);
        return id;
    }
}
