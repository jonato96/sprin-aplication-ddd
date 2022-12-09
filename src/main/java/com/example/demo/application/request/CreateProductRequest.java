package com.example.demo.application.request;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateProductRequest {

	@NotNull private BigDecimal price;
	@NotNull private String name;

    @JsonCreator
    public CreateProductRequest(@JsonProperty("price") final BigDecimal price, @JsonProperty("name") final String name) {
        this.price = price;
        this.name = name;
    }

	public BigDecimal getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

    
}
