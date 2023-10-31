package com.example.eCommerce.Exceptions;

public class ProductValidationException extends RuntimeException{
    public ProductValidationException(String message){
        super(message);
    }
}
