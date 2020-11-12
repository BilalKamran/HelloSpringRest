package com.example.demo.controller;

import com.example.demo.response.ApiResponse;
import com.example.demo.payload.BookPayload;
import com.example.demo.exception.ApiException;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;

@RestController
@RequestMapping("/book")
public class BookController {

    final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public ApiResponse getBooks() {

        return Optional.of(bookService.getBooks())
                .map(data-> new ApiResponse(HttpStatus.OK.value(),"Success", data, null))
                .orElseThrow(()->new ApiException("Api Exception Occured"));
    }

    @GetMapping("/{id}")
    public ApiResponse getBook(@PathVariable(value="id") Integer id) {

        return Optional.of(bookService.getBook(id))
                .map(data-> new ApiResponse(HttpStatus.OK.value(),"Success", data, null))
                .orElseThrow(()->new ApiException("Api Exception Occured"));
    }

    @PostMapping
    public ApiResponse addBook(@Valid @RequestBody BookPayload bookPayload){

        return Optional.of(bookService.addBook(bookPayload))
                .map(data-> new ApiResponse(HttpStatus.OK.value(),"Success", data, null))
                .orElseThrow(()->new ApiException("Api Exception Occured"));
    }

    @PutMapping("/{id}")
    public ApiResponse updateBook(@PathVariable(value="id") Integer id, @Valid @RequestBody BookPayload bookPayload){

        return Optional.of(bookService.updateBook(id, bookPayload))
                .map(data-> new ApiResponse(HttpStatus.OK.value(),"Success", data, null))
                .orElseThrow(()->new ApiException("Api Exception Occured"));
    }

    @DeleteMapping("/{id}")
    public ApiResponse deleteBook(@PathVariable(value="id") Integer id){

        return Optional.of(bookService.deleteBook(id))
                .map(data-> new ApiResponse(HttpStatus.OK.value(),"Success", data, null))
                .orElseThrow(()->new ApiException("Api Exception Occured"));
    }
}
