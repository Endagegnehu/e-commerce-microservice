package com.example.productservice.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.example.productservice.model.Product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductResponse {
    String id;
    String name;
    String description;
    Double price;
    public static List<ProductResponse> from(List<Product> products) {
        return products.stream().map(product -> from(product)).collect(Collectors.toList());
        }
    public static ProductResponse from(Product product) {
        return ProductResponse.builder()
            .id(product.getId())
            .name(product.getName())
            .description(product.getDescription())
            .price(product.getPrice())
            .build();
        } 
    }

