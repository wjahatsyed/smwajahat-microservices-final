package com.smwajahat.adil.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author Syed Muhammad Wajahat
 * Creation date: 07/09/2023
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineItemsDto {
    private long id;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;
}
