package com.crud.cliente.controller.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.crud.cliente.service.exceptions.ObjectNotFoundExeptions;


@ControllerAdvice
public class ControllerExceptionHandler {
	
	@ExceptionHandler(ObjectNotFoundExeptions.class)
	public ResponseEntity<StandardError> objectNotFoundException(ObjectNotFoundExeptions object, HttpServletRequest request) {
		StandardError erro = new StandardError(System.currentTimeMillis(), HttpStatus.NOT_FOUND.value(), 
				"Objeto não encontrado", object.getMessage(), request.getRequestURI());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
	}

}
