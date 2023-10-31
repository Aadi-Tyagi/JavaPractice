package com.example.eCommerce.Exceptions;

public class OrderValidationException extends Throwable {
    public OrderValidationException(String message) {
        super(message);
    }
}
