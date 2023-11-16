package com.example.productservice.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@SpringBootTest
@AutoConfigureMockMvc
public class ProductControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testCreateProduct() throws Exception {
        mockMvc.perform(post("/api/v1/product")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\n" +
                "    \"name\": \"Product 1\",\n" +
                "    \"description\": \"Product 1 description\",\n" +
                "    \"price\": 100.00\n" +
                "}"))
            .andExpect(status().isCreated());
    }

    @Test
    void testGetAllProducts() throws Exception {
        mockMvc.perform(get("/api/v1/product"))
            .andExpect(status().isOk());
    }
}
