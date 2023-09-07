package com.smwajahat.adil.microservicesproject.service;

import com.smwajahat.adil.microservicesproject.dto.ProductRequest;
import com.smwajahat.adil.microservicesproject.dto.ProductResponse;
import com.smwajahat.adil.microservicesproject.model.Product;
import com.smwajahat.adil.microservicesproject.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Syed Muhammad Wajahat
 * Creation date: 06/09/2023
 * Using @RequiredArgsConstructor to provide with a constructor with required initialization
 * Using @Slf4j from Lombok for logging
 * at compile time.
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    private final ProductRepository productRepository;


    public void createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();

        productRepository.save(product);
        //getId() returned id will replace {} placeholder
        log.info("Product {} is saved in database", product.getId());
    }

    public List<ProductResponse> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return products.stream().map(this::mapToProductResponse).toList();

    }

    private ProductResponse mapToProductResponse(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }

}
