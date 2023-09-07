package com.smwajahat.adil.orderservice.repository;

import com.smwajahat.adil.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Syed Muhammad Wajahat
 * Creation date: 07/09/2023
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
