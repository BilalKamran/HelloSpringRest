package com.example.demo.controller;

import com.example.demo.payload.BookPayload;
import com.example.demo.service.AbstractService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
@Api("Set of endpoints for Creating, Retrieving, Updating and Deleting of Persons.")
public class BookController extends ApiController<BookPayload,Integer> {

    final AbstractService bookService;

    @Autowired
    public BookController(AbstractService bookService) {
        super(bookService);
        this.bookService = bookService;
    }
}
