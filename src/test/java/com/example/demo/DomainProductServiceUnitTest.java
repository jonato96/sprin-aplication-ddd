package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.math.BigDecimal;
import java.util.UUID;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import com.example.demo.domain.Product;
import com.example.demo.domain.repository.ProductRepository;
import com.example.demo.domain.service.DomainProductService;

public class DomainProductServiceUnitTest {
	
	private ProductRepository productRepository;    
    private DomainProductService testedProduct;
    @BeforeEach
    void setUp() {        
        productRepository = mock(ProductRepository.class);        
        testedProduct = new DomainProductService(productRepository);
    }   
    
    @Test
    void shouldCreateProduct_thenSaveIt() {
        final UUID id = testedProduct.createProduct(BigDecimal.TEN, "productName");

        verify(productRepository).save(any(Product.class));
        assertNotNull(id);
    }
}
