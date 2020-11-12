package com.example.demo.service;

import com.example.demo.payload.BookPayload;
import com.example.demo.response.BookResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface BookService {
    List<BookResponse> getBooks();

    BookResponse getBook(Integer id);

    BookResponse addBook(BookPayload bookPayload);

    BookResponse updateBook(Integer id, BookPayload bookPayload);

    Integer deleteBook(Integer id);

}
