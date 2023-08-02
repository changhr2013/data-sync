package com.changhr.datasync.service;

import java.util.List;

public interface BaseService<T, ID>  {
    T findById(ID id);
    List<T> findAll();

    T save(T t);
    List<T> saveAll(Iterable<T> entities);

    void deleteById(ID id);
    void delete(T t);
    void deleteAll();
    void deleteAll(Iterable<T> entities);
}