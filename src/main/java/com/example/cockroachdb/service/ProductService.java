package com.example.cockroachdb.service;

import com.example.cockroachdb.dto.ProductDto;
import com.example.cockroachdb.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;
    public List<ProductDto> getAllProducts() {
        return this.productRepository.findAll()
                .stream()
                .map(product -> product.entityToDto())
                .collect(Collectors.toList());
    }
}
