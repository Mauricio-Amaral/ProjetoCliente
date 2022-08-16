package com.crud.cliente.controller.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.crud.cliente.service.exceptions.ObjectNotFoundExeptions;

@ControllerAdvice
public class ResourceExceptionHandler {

	public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundExeptions ex, HttpServletRequest request) {
		StandardError erro = new StandardError(System.currentTimeMillis(), HttpStatus.NOT_FOUND.value(),
				"Object Not Found", ex.getMessage(), request.getRequestURI());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
	}
}
