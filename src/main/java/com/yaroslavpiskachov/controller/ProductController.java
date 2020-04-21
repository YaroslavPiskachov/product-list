package com.yaroslavpiskachov.controller;

import com.yaroslavpiskachov.exception.ProductNotFoundException;
import com.yaroslavpiskachov.model.PaymentCard;
import com.yaroslavpiskachov.model.Product;
import com.yaroslavpiskachov.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/product")
    public List<Product> findAllProducts() {
        return productService.findAll();
    }

    @PostMapping("/product/buy/{id}")
    public Product buyProduct(@PathVariable() String id, @RequestBody PaymentCard paymentCard) throws ProductNotFoundException {
        //payment logic
        return productService.getById(id);
    }
}
