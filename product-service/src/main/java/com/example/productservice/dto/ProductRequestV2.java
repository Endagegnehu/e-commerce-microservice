package com.example.productservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequestV2 extends ProductRequest {
    private boolean isAvailable;

    @Builder(builderMethodName = "v2Builder")
    public ProductRequestV2(String name, String description, Double price, boolean isAvailable) {
        super(name, description, price);
        this.isAvailable = isAvailable;
    }
}