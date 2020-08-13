package com.yikun.blog.core;

public class BusinessException extends RuntimeException {

    public BusinessException(String message){
        super(message);
    }
}
