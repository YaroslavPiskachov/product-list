package com.yaroslavpiskachov.controller;

import com.yaroslavpiskachov.exception.ProductNotFoundException;
import com.yaroslavpiskachov.model.PaymentCard;
import com.yaroslavpiskachov.model.Product;
import com.yaroslavpiskachov.service.ProductService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/product")
    public Page<Product> findAllProducts(Pageable page) {
        return productService.findAll(page);
    }

    @PostMapping("/product/buy/{id}")
    public Product buyProduct(@PathVariable() String id, @RequestBody PaymentCard paymentCard) throws ProductNotFoundException {
        //payment logic
        return productService.getById(id);
    }
}
