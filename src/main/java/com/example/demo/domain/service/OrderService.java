package com.example.demo.domain.service;

import com.example.demo.domain.Product;
import com.example.demo.domain.Order;

import java.util.List;
import java.util.UUID;

public interface OrderService {
	
	List<Order> findAll();
	
    UUID createOrder(Product product);

    void addProduct(UUID id, Product product);

    void completeOrder(UUID id);

    void deleteProduct(UUID id, UUID productId);
}
