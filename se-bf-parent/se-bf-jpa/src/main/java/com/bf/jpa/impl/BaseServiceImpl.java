package com.bf.jpa.impl;


import com.bf.jpa.IBaseDao;
import com.bf.jpa.IBaseService;

import java.util.List;

public abstract class BaseServiceImpl<T, ID> implements IBaseService<T, ID> {

    /**
     * 抽象方法，必须实现，返回DAO实例
     *
     * @return DAO实例
     */
    public abstract IBaseDao<T, ID> getDao();

    @Override
    public List<T> search() {
        return getDao().findAll();
    }

    @Override
    public void save(T entity) {
        getDao().save(entity);
    }

    @Override
    public void update(T entity) {
        getDao().saveAndFlush(entity);
    }

    @Override
    public void delById(ID id) {
        getDao().deleteById(id);
    }

    @Override
    public T getById(ID id) {
        return getDao().getOne(id);
    }
}
