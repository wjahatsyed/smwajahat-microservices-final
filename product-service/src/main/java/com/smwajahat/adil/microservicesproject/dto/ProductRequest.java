package com.smwajahat.adil.microservicesproject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author Syed Muhammad Wajahat
 * Creation date: 06/09/2023
 *
 * Using @Data annotation from Lombok to have getters and setters
 * Using @Builder annotation to use builder method for object creation
 * Using @AllArgsConstructor to get provided with an all instance variable argument constructor
 * Using @NoArgsConstructor to get a default constructor
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {
    private String name;
    private String description;
    private BigDecimal price;
}
