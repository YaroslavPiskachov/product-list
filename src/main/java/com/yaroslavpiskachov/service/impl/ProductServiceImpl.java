package com.yaroslavpiskachov.service.impl;

import com.yaroslavpiskachov.exception.ProductNotFoundException;
import com.yaroslavpiskachov.model.Product;
import com.yaroslavpiskachov.repository.ProductRepository;
import com.yaroslavpiskachov.service.ProductService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Page<Product> findAll(Pageable page) {
        return productRepository.findAll(page);
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
