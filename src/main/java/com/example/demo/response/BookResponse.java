package com.example.demo.response;

import com.example.demo.entity.Book;

public class BookResponse {
    private Integer id;
    private String name;
    private Integer pages;

    public BookResponse() {
    }

    public BookResponse(Book book) {
        this.id = book.getId();
        this.name = book.getName();
        this.pages = book.getPages();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }
}
