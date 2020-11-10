package com.example.demo.service;

import com.example.demo.dao.BookDao;
import com.example.demo.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImp implements BookService{

    @Autowired
    BookDao bookDao;

    @Override
    public List<Book> getBooks() {
        return bookDao.findAll();
    }

    @Override
    public Book saveBook(Book book) {
        return bookDao.save(book);
    }
}