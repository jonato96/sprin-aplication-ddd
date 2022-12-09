package com.example.demo.infraestructure.repository.mongodb;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.domain.Product;

import java.util.UUID;

@Repository
public interface SpringDataMongoProductRepository extends MongoRepository<Product, UUID>{

}