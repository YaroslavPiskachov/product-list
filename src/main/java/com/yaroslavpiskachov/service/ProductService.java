package com.yaroslavpiskachov.service;

import com.yaroslavpiskachov.exception.ProductNotFoundException;
import com.yaroslavpiskachov.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    Product add(Product product);
    Product getById(String id) throws ProductNotFoundException;
}
