package com.example.demo.domain;

class DomainException extends RuntimeException {
    
	private static final long serialVersionUID = 1L;

	DomainException(final String message) {
        super(message);
    }
}
