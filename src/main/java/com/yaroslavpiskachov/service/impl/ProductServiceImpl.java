package com.yaroslavpiskachov.service.impl;

import com.yaroslavpiskachov.exception.ProductNotFoundException;
import com.yaroslavpiskachov.model.Product;
import com.yaroslavpiskachov.repository.ProductRepository;
import com.yaroslavpiskachov.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product add(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product getById(String id) throws ProductNotFoundException {
        return productRepository.findById(id).orElseThrow(() -> new ProductNotFoundException("Could not find product by id: " + id));
    }
}
