package com.example.demo.application.rest;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.application.request.CreateProductRequest;
import com.example.demo.application.response.CreateProductResponse;
import com.example.demo.domain.Product;
import com.example.demo.domain.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    List<Product> findAll() {
    	return productService.findAll();
    }
    
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    CreateProductResponse createOrder(@RequestBody final CreateProductRequest createProductRequest) {
        final UUID id = productService.createProduct(createProductRequest.getPrice(), createProductRequest.getName());
        return new CreateProductResponse(id);
    }
}
