package com.smwajahat.adil.orderservice.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

/**
 * @author Syed Muhammad Wajahat
 * @Data has a known bug when used with @Entity so
 * using @Getter and @Setter
 * Creation date: 07/09/2023
 */
@Entity
@Table(name = "t_orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String orderNumber;
    @OneToMany(cascade = CascadeType.ALL)
    private List<OrderLineItems> orderLineItemsList;
}
