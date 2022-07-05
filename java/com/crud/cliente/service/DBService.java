package com.crud.cliente.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.cliente.entities.Cliente;
import com.crud.cliente.entities.Usuario;
import com.crud.cliente.repositories.ClienteRepository;
import com.crud.cliente.repositories.UsuarioRepository;

@Service
public class DBService {
	
	@Autowired
	private ClienteRepository cliRepository;
	@Autowired
	private UsuarioRepository usuRepository;
	
	public void instanciaDB() {
		
		Cliente cli = new Cliente();
		Usuario us = new Usuario();
		
		cliRepository.saveAll(Arrays.asList(cli));
		usuRepository.saveAll(Arrays.asList(us));
		
	}

}
