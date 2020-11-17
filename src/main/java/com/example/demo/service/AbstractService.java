package com.example.demo.service;

import java.util.List;

public interface AbstractService<T, Id> {
    List<T> findAll();

    T findById(Id id);

    T add(T body);

    T update(Id id, T body);

    void deleteById(Id id);
}
