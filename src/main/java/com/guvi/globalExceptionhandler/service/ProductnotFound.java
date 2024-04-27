package com.guvi.globalExceptionhandler.service;

public class ProductnotFound extends  RuntimeException{
    public ProductnotFound(String message) {
        super(message);
    }
}


