package com.example.demo.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
	class AppException {

	  @ResponseBody
	  @ExceptionHandler(Exception.class)
	  String AppException(Exception ex) {
	    return ex.getMessage();
	  }
	}
