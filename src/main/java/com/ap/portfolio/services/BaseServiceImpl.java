package com.ap.portfolio.services;

import com.ap.portfolio.entities.Base;
import com.ap.portfolio.repositories.BaseRepository;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

public abstract class BaseServiceImpl<E extends Base, ID extends Serializable> implements BaseService<E, ID> {
    protected BaseRepository<E, ID> baseRepository;

    public BaseServiceImpl(BaseRepository<E, ID> baseRepository) {
        this.baseRepository = baseRepository;
    }

    @Override
    @Transactional
    public List<E> findAll() {
        return baseRepository.findAll();
    }

    @Override
    @Transactional
    public E save(E entity) {
        return baseRepository.save(entity);
    }

    @Override
    public E update(E entity) {
        return baseRepository.save(entity);
    }

    @Override
    public void delete(ID id) {
        baseRepository.deleteById(id);
    }
}
