package com.crud.cliente.service;

import java.util.Arrays;

import com.crud.cliente.entities.Cliente;
import com.crud.cliente.entities.Usuario;
import com.crud.cliente.repositories.ClienteRepository;
import com.crud.cliente.repositories.UsuarioRepository;

public class DBService {
	
	private ClienteRepository cliRepository;
	private UsuarioRepository usuRepository;
	
	public void instanciaDB() {
		
		Cliente cli = new Cliente();
		Usuario us = new Usuario();
		
		cliRepository.saveAll(Arrays.asList(cli));
		usuRepository.saveAll(Arrays.asList(us));
		
	}

}
