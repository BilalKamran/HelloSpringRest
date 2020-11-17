package com.example.demo.controller;

import com.example.demo.response.ApiResponse;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

public interface AbstractController<T,Id> {

    ApiResponse getAll();

    ApiResponse get(Id id);

    ApiResponse add(T body);

    ApiResponse update(Id id, T body);

    ApiResponse delete(Id id);
}
