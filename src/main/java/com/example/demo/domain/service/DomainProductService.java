package com.example.demo.domain.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import com.example.demo.domain.Product;
import com.example.demo.domain.repository.ProductRepository;

public class DomainProductService implements ProductService{

	private final ProductRepository productRepository;

    public DomainProductService(final ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    
	@Override
	public List<Product> findAll() {
		
		return productRepository.findAll();
	}

	@Override
	public UUID createProduct(BigDecimal price, String name) {
		final Product product = new Product(UUID.randomUUID(), price, name);
        productRepository.save(product);
        return product.getId();
	}

}
