package com.ap.portfolio.controllers;

import com.ap.portfolio.entities.Base;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;

public interface BaseController<E extends Base,ID extends Serializable> {
    public ResponseEntity<?> getAll();
    public ResponseEntity<?> save(@RequestBody E entity);
    public ResponseEntity<?> update(@RequestBody E entity);
    public ResponseEntity<?> delete(@PathVariable("id") ID id);
}
