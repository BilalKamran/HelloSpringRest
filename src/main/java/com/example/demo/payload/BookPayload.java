package com.example.demo.payload;

import com.example.demo.entity.Book;
import io.swagger.annotations.*;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.Objects;

@ApiModel(description = "Class representing a book tracked by the application.")
public class BookPayload {

    @NotBlank(message = "Please enter book name")
    private String name;

    @Positive(message = "Please enter valid number of pages")
    @NotNull(message = "Please enter valid number of pages")
    private Integer pages;

    @AssertFalse(message = "Holy books are not allowed")
    @NotNull(message = "Please enter if book holy or not")
    private boolean isHoly;

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

    public boolean isHoly() {
        return isHoly;
    }

    public void setHoly(boolean holy) {
        isHoly = holy;
    }

    public static Book mapPayloadToEntity(Integer id, BookPayload bookPayload){
        Book book = new Book();
        if (Objects.nonNull(id)){
            book.setId(id);
        }
        book.setName(bookPayload.getName());
        book.setPages(bookPayload.getPages());
        bookPayload.setHoly(bookPayload.isHoly());
        return book;
    }
}
