package com.crud.cliente.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.crud.cliente.service.DBService;

@Configuration
@Profile("test")
public class TestConfig {
	
	private DBService dbService;
	
	public void injetaDB() {
		this.dbService.instanciaDB();
	}

}
