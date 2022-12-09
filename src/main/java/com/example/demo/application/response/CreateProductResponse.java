package com.example.demo.application.response;

import java.util.UUID;

public class CreateProductResponse {

	private final UUID id;

    public CreateProductResponse(final UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }
}
