package com.crud.cliente.controller.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {
	private static final long serialVersionUID = 1L;
	
	private List<FieldMessage> lista = new ArrayList<>();

	public ValidationError(Long timestamp, Integer status, String error, String message, String path,
			List<FieldMessage> lista) {
		super(timestamp, status, error, message, path);
		this.lista = lista;
	}

	public ValidationError() {
		super();
	}

	public ValidationError(Long timestamp, Integer status, String error, String message, String path) {
		super(timestamp, status, error, message, path);
	}

	public List<FieldMessage> getLista() {
		return lista;
	}

	public void addLista(String fieldName, String message) {
		this.lista.add(new FieldMessage(fieldName, message));
	}

}
