package org.hiber.dao;

import java.util.List;

public interface CommonDAO<T> {

    List<T> findAll();

    List<T> findAll(String email);

    T get(long id);

    void update(T olj);

    void delete(long id);

    void add(T obj);
}
