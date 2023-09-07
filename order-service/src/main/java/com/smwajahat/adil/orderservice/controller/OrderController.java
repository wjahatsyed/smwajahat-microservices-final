package com.smwajahat.adil.orderservice.controller;

import com.smwajahat.adil.orderservice.dto.OrderRequest;
import com.smwajahat.adil.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * @author Syed Muhammad Wajahat
 * Creation date: 07/09/2023
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/order")
public class OrderController {
    private final OrderService orderService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest orderRequest){
        orderService.placeOrder(orderRequest);
        return "Order placed successfully!";
    }
}
