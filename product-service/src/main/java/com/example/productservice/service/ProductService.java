package com.example.productservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.productservice.dto.ProductRequest;
import com.example.productservice.model.Product;
import com.example.productservice.repository.ProductRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProductService {
    
    private ProductRepository repository;

    ProductService(ProductRepository repository){
        this.repository = repository;
    }

    public void createProduct(ProductRequest productRequest){
        Product product = Product.builder()
            .name(productRequest.getName())
            .description(productRequest.getDescription())
            .price(productRequest.getPrice())
            .build();
        repository.save(product);
        log.info("Product created: {}", product);
    }

    public List<Product> getAllProducts() {
        return repository.findAll();
    }
}
