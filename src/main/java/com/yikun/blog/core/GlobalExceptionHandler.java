package com.yikun.blog.core;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public Result<Object> runtimeExceptionHandler(Exception ex) {
        if(ex instanceof BusinessException){
            return Result.builder()
                    .success(false)
                    .message(ex.getMessage())
                    .build();
        }else {
            return Result.builder()
                    .success(false)
                    .message(Arrays.toString(ex.getStackTrace()))
                    .build();
        }
    }
}
