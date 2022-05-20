package com.hansol.spring.product.config;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

//import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RestControllerAdvice;

import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.NoSuchElementException;

@ControllerAdvice

public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(NoSuchElementException.class)
    protected ResponseEntity<?> handleNoSuchElementFoundException(NoSuchElementException e) {
        return new ResponseEntity(BaseResp.res(StatusCode.NOT_FOUND, ResponseMessage.NOT_FOUND), HttpStatus.NOT_FOUND);
    }

    /**
     * 지원하지 않은 HTTP method 호출 할 경우 발생
     */
/*    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    protected ResponseEntity<?> handleHttpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException e) {
        return new ResponseEntity(BaseResp.res(StatusCode.METHOD_NOT_ALLOWED, ResponseMessage.METHOD_NOT_ALLOWED), HttpStatus.METHOD_NOT_ALLOWED);

    }*/

    /**
     * 따로 처리하지 않은 남은 에러들
     */
    @ExceptionHandler(Exception.class)
    protected ResponseEntity<?> handleException(Exception e) {
        return new ResponseEntity(BaseResp.res(StatusCode.INTERNAL_SERVER_ERROR, ResponseMessage.INTERNAL_SERVER_ERROR), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
