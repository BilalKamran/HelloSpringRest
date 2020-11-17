package com.example.demo.service;

import com.example.demo.entity.Book;
import com.example.demo.payload.BookPayload;
import com.example.demo.response.BookResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface BookService extends AbstractService<Book, Integer>{}
