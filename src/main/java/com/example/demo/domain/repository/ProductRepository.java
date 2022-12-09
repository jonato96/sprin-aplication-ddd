package com.example.demo.domain.repository;

import java.util.List;
import com.example.demo.domain.Product;

public interface ProductRepository {
	
	List<Product> findAll();
	
	void save(Product product);

}
