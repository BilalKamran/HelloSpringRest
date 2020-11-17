package com.example.demo.controller;

import com.example.demo.exception.ApiException;
import com.example.demo.response.ApiResponse;
import com.example.demo.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@ResponseBody
public class AbstractControllerImp<T, Id> implements AbstractController<T, Id> {

    final AbstractService<T, Id>  abstractService;

    @Autowired
    public AbstractControllerImp(AbstractService<T, Id>  abstractService) {
        this.abstractService = abstractService;
    }

    @GetMapping
    @Override
    public ApiResponse getAll() {
        return Optional.of(abstractService.findAll())
                .map(data-> new ApiResponse(HttpStatus.OK.value(),"Success", data, null))
                .orElseThrow(()->new ApiException("Api Exception Occured"));
    }

    @GetMapping("/{id}")
    @Override
    public ApiResponse get(@PathVariable Id id) {
        return Optional.of(abstractService.findById(id))
                .map(data-> new ApiResponse(HttpStatus.OK.value(),"Success", data, null))
                .orElseThrow(()->new ApiException("Api Exception Occured"));
    }

    @PostMapping
    @Override
    public ApiResponse add(T body) {
        return Optional.of(null/*abstractService.add(BookPayload.mapPayloadToEntity(null, body))*/)
                .map(data-> new ApiResponse(HttpStatus.OK.value(),"Success", data, null))
                .orElseThrow(()->new ApiException("Api Exception Occured"));
    }

    @PutMapping("/{id}")
    @Override
    public ApiResponse update(@PathVariable Id id, T body) {
        return Optional.of(null/*abstractService.update(id, BookPayload.mapPayloadToEntity(id, body))*/)
                .map(data-> new ApiResponse(HttpStatus.OK.value(),"Success", data, null))
                .orElseThrow(()->new ApiException("Api Exception Occured"));
    }

    @DeleteMapping("/{id}")
    @Override
    public ApiResponse delete(Id id) {
        abstractService.deleteById(id);
        return new ApiResponse(HttpStatus.OK.value(),"Success", id, null);
    }
}
