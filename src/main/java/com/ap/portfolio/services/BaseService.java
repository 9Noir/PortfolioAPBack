package com.ap.portfolio.services;

import com.ap.portfolio.entities.Base;

import java.io.Serializable;
import java.util.List;

public interface BaseService<E extends Base, ID extends Serializable> {
    public List<E> findAll();

    public E save(E entity);

    public E update(E entity);

    public void delete(ID id);
}
