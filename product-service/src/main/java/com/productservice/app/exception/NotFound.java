package com.productservice.app.exception;

public class NotFound extends  RuntimeException{
    public NotFound(String message, String id) {
        super(String.format(message, id));
    }
}