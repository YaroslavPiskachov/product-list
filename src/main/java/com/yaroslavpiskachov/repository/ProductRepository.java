package com.yaroslavpiskachov.repository;

import com.yaroslavpiskachov.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
