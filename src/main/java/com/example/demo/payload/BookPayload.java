package com.example.demo.payload;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

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
}
