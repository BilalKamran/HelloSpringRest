package com.example.demo.advice;

import com.example.demo.response.ApiResponse;
import org.springframework.beans.TypeMismatchException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@ControllerAdvice
public class RestResponseEntityExceptionHandler
        extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                                                  HttpHeaders headers, HttpStatus status, WebRequest request) {

        List<Object> objectList = new ArrayList<>();
        for (ObjectError error : ex.getBindingResult().getAllErrors()) {
            objectList.add(error.getDefaultMessage());
        }
        ApiResponse apiResponse = new ApiResponse(HttpStatus.NOT_FOUND.value(), "Failed", null, objectList);

        return handleExceptionInternal(ex, apiResponse,
                new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }

    @ExceptionHandler(value = { TypeMismatchException.class })
    protected ResponseEntity<Object> handleTypeMismatch(
            Exception ex, WebRequest request) {

        String responseMessage = "Please enter valid type of value";
        List<Object> objectList = new ArrayList<>();
        objectList.add(responseMessage);
        ApiResponse apiResponse = new ApiResponse(HttpStatus.NOT_FOUND.value(), "Failed", null, objectList);

        return handleExceptionInternal(ex, apiResponse,
                new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }

    @ExceptionHandler(value = { EmptyResultDataAccessException.class, NoSuchElementException.class })
    protected ResponseEntity<Object> handleEmptyResult(
            RuntimeException ex, WebRequest request) {

        String responseMessage = "No record found";
        List<Object> objectList = new ArrayList<>();
        objectList.add(responseMessage);
        ApiResponse apiResponse = new ApiResponse(HttpStatus.NOT_FOUND.value(), "Failed", null, objectList);

        return handleExceptionInternal(ex, apiResponse,
                new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }
}