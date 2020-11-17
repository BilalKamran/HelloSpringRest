package com.example.demo.controller;

import com.example.demo.response.ApiResponse;
import com.example.demo.payload.BookPayload;
import com.example.demo.exception.ApiException;
import com.example.demo.service.AbstractService;
import com.example.demo.service.BookService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;

public interface BookController extends AbstractController<BookPayload,Integer> {

//    final AbstractService bookService;
//
//    @Autowired
//    public BookController(AbstractService bookService) {
//        super(bookService);
//        this.bookService = bookService;
//    }

//    @GetMapping
//    @ApiOperation("Returns list of all Books in the system.")
//    public ApiResponse getBooks() {
//
//        return Optional.of(bookService.findAll())
//                .map(data-> new ApiResponse(HttpStatus.OK.value(),"Success", data, null))
//                .orElseThrow(()->new ApiException("Api Exception Occured"));
//    }
//
//    @GetMapping("/{id}")
//    @ApiOperation("Returns a single Book from the system.")
//    public ApiResponse getBook(@ApiParam("Id of the book to be added. Cannot be empty.")
//                                   @PathVariable(value="id") Integer id) {
//
//        return Optional.of(bookService.findById(id))
//                .map(data-> new ApiResponse(HttpStatus.OK.value(),"Success", data, null))
//                .orElseThrow(()->new ApiException("Api Exception Occured"));
//    }
//
//    @PostMapping
//    public ApiResponse addBook(@Valid @RequestBody BookPayload bookPayload){
//
//        return Optional.of(bookService.add(BookPayload.mapPayloadToEntity(null, bookPayload)))
//                .map(data-> new ApiResponse(HttpStatus.OK.value(),"Success", data, null))
//                .orElseThrow(()->new ApiException("Api Exception Occured"));
//    }
//
//    @PutMapping("/{id}")
//    public ApiResponse updateBook(@PathVariable(value="id") Integer id, @Valid @RequestBody BookPayload bookPayload){
//
//        return Optional.of(bookService.update(id, BookPayload.mapPayloadToEntity(id, bookPayload)))
//                .map(data-> new ApiResponse(HttpStatus.OK.value(),"Success", data, null))
//                .orElseThrow(()->new ApiException("Api Exception Occured"));
//    }
//
//    @DeleteMapping("/{id}")
//    public ApiResponse deleteBook(@PathVariable(value="id") Integer id){
//
//        bookService.deleteById(id);
//        return new ApiResponse(HttpStatus.OK.value(),"Success", id, null);
//    }
}
