package com.example.url.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionController {

    @ExceptionHandler(value=IllegalArgumentException.class)
    public ResponseEntity<String> handlerBaseException(IllegalArgumentException e){
    	return new ResponseEntity<String>("wrong_url", HttpStatus.METHOD_NOT_ALLOWED);
    }
}
