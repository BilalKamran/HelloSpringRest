package com.example.demo.entity;

import com.example.demo.payload.BookPayload;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private Integer pages;

    private boolean isHoly;

    public Book() {
    }

    public Book(BookPayload bookPayload) {
        this.name = bookPayload.getName();
        this.pages = bookPayload.getPages();
        this.isHoly = bookPayload.isHoly();
    }

    public Book(Integer id, BookPayload bookPayload) {
        this.id = id;
        this.name = bookPayload.getName();
        this.pages = bookPayload.getPages();
        this.isHoly = bookPayload.isHoly();
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
    public void setName(String bookName) {
        this.name = bookName;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public boolean isHoly() {
        return isHoly;
    }

    public void setHoly(boolean holy) {
        isHoly = holy;
    }

    public void setBook(BookPayload bookPayload){
        this.name = bookPayload.getName();
        this.pages = bookPayload.getPages();
        this.isHoly = bookPayload.isHoly();
    }

    public void setBook(Integer id, BookPayload bookPayload){
        this.id = id;
        this.name = bookPayload.getName();
        this.pages = bookPayload.getPages();
        this.isHoly = bookPayload.isHoly();
    }
}
