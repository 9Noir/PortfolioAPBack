package com.ap.portfolio.controllers;

import com.ap.portfolio.entities.Base;
import com.ap.portfolio.services.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(origins = "*")
public abstract class BaseControllerImpl<E extends Base, S extends BaseServiceImpl<E, Long>> implements BaseController<E, Long> {

    @Autowired
    protected S service;

    @Override
    @GetMapping
    public ResponseEntity<?> getAll() {
        List<E> list = service.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @Override
    @PostMapping
    public ResponseEntity<?> save(@RequestBody E entity) {
        E newEntity = service.save(entity);
        return new ResponseEntity<>(newEntity, HttpStatus.CREATED);
    }

    @Override
    @PutMapping
    public ResponseEntity<?> update(@RequestBody E entity) {
        E updatedEntity = service.save(entity);
        return new ResponseEntity<>(updatedEntity, HttpStatus.OK);
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
