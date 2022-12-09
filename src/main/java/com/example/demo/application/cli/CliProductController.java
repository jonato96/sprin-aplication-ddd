package com.example.demo.application.cli;

import java.math.BigDecimal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.domain.Product;
import com.example.demo.domain.service.ProductService;

@Component
public class CliProductController {
	
	private static final Logger LOG = LoggerFactory.getLogger(CliOrderController.class);
	private final ProductService productService;

    @Autowired
    public CliProductController(ProductService productService) {
        this.productService = productService;
    }
    
    public List<Product> findAllProduct(){
    	LOG.info("<<Find all products>>");
    	return productService.findAll();
    }
    
    public void createProduct() {
        LOG.info("<<Create product>>");   
        LOG.info("Creating new product: Monitor Quasad");
        productService.createProduct(BigDecimal.valueOf(200), "Monitor Quasad");
    }    
    
}
