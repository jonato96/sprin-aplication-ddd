package com.example.demo.infraestructure.configuration;

import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = "com.example.demo.infraestructure.repository.mongodb")
public class MongoDBConfiguration {
}
