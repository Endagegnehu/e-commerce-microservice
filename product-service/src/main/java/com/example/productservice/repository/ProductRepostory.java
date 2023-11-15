package com.example.productservice.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.productservice.model.Product;

@Repository
public interface ProductRepostory extends MongoRepository<Product, String> {
        
}
