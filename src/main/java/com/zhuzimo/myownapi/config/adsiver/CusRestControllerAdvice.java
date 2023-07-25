package com.zhuzimo.myownapi.config.adsiver;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CusRestControllerAdvice {

    @ExceptionHandler(Exception.class)
    public String handleException(Exception e) {
        return "服务异常";
    }
}
