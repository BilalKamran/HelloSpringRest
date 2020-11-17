package com.example.demo.service;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public class AbstractServiceImp<T, Id> implements AbstractService<T, Id> {

    private final JpaRepository<T, Id> repository;

    public AbstractServiceImp(JpaRepository<T, Id> repository) {
        this.repository = repository;
    }

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    public T findById(Id id) {
        return repository.findById(id).get();
    }

    @Override
    public T add(T body) {
        return repository.save(body);
    }

    @Override
    public T update(Id id, T body) {
        return repository.save(body);
    }

    @Override
    public void deleteById(Id id) {
        repository.deleteById(id);
    }
}
