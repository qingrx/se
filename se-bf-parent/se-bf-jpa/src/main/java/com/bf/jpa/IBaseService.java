package com.bf.jpa;

import java.util.List;

public interface IBaseService<T, ID> {
    List<T> search();

    void save(T entity);

    void update(T entity);

    void delById(ID id);

    T getById(ID id);

}
