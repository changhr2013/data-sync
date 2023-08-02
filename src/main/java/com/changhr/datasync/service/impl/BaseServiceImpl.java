package com.changhr.datasync.service.impl;

import java.util.List;

import com.changhr.datasync.service.BaseService;
import org.springframework.data.jpa.repository.JpaRepository;


public class BaseServiceImpl<T, ID> implements BaseService<T, ID> {
    protected final JpaRepository<T, ID> repository;

    public BaseServiceImpl(JpaRepository<T, ID> repository) {
        this.repository = repository;
    }

    @Override
    public T findById(ID id) {
        return this.repository.findById(id).orElse(null);
    }

    @Override
    public List<T> findAll() {
        return this.repository.findAll();
    }

    @Override
    public T save(T t) {
        return this.repository.save(t);
    }

    @Override
    public List<T> saveAll(Iterable<T> entities) {
        return this.repository.saveAll(entities);
    }

    @Override
    public void deleteById(ID id) {
        this.repository.deleteById(id);
    }

    @Override
    public void delete(T t) {
        this.repository.delete(t);
    }

    @Override
    public void deleteAll() {
        this.repository.deleteAll();
    }

    @Override
    public void deleteAll(Iterable<T> entities) {
        this.repository.deleteAll(entities);
    }
}