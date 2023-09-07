package com.smwajahat.adil.microservicesproject.repository;

import com.smwajahat.adil.microservicesproject.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Syed Muhammad Wajahat
 * Creation date: 06/09/2023
 */
public interface ProductRepository extends MongoRepository<Product, String> {

}
