package com.example.cockroachdb.controller;

import com.example.cockroachdb.dto.ProductDto;
import com.example.cockroachdb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/")
    public List<ProductDto> getAllProducts() {
        return this.productService.getAllProducts();
    }
}
