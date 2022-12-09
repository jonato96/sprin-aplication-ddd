package com.example.demo.domain.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import com.example.demo.domain.Product;

public interface ProductService {

	List<Product> findAll();
	
	UUID createProduct(BigDecimal price, String name);
	
}
