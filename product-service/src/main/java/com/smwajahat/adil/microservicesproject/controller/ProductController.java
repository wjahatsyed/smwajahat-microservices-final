package com.smwajahat.adil.microservicesproject.controller;

import com.smwajahat.adil.microservicesproject.dto.ProductRequest;
import com.smwajahat.adil.microservicesproject.dto.ProductResponse;
import com.smwajahat.adil.microservicesproject.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.List;

/**
 * @author Syed Muhammad Wajahat
 * Creation date: 06/09/2023
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/product")
public class ProductController {
    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest) {
        System.out.println("Called");
        productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts() {
        return productService.getAllProducts();
    }
}
