package com.example.demo.infraestructure.repository.mongodb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.domain.Product;
import com.example.demo.domain.repository.ProductRepository;

@Component
public class MongoDbProductRepository implements ProductRepository{

	private final SpringDataMongoProductRepository productRepository;

    @Autowired
    public MongoDbProductRepository(final SpringDataMongoProductRepository productRepository) {
        this.productRepository = productRepository;
    }
	
	@Override
	public List<Product> findAll() {		
		return productRepository.findAll();
	}

	@Override
	public void save(Product product) {
		productRepository.save(product);
		
	}

}
