package com.smwajahat.adil.inventoryservice.repository;

import com.smwajahat.adil.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author Syed Muhammad Wajahat
 * Creation date: 08/09/2023
 */
public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    List<Inventory> findBySkuCodeIn(List<String> skuCode);


}
