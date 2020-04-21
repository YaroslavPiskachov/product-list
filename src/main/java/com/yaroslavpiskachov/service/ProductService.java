package com.yaroslavpiskachov.service;

import com.yaroslavpiskachov.exception.ProductNotFoundException;
import com.yaroslavpiskachov.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
    Page<Product> findAll(Pageable page);
    Product add(Product product);
    Product getById(String id) throws ProductNotFoundException;
}
