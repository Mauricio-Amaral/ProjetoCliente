package com.crud.cliente.services;

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
	private UsuarioRepository usuarioRepository;
	@Autowired
	private ClienteRepository clienteRepository;

	public void instanciaDB() {
			
		Cliente cli = new Cliente(null, "Mauricio", "31327624826", "Av Antonieta Pavoni D'Alessandro", 
				 439, "Jardim nova Rincão", "981380892");
		
		Usuario us = new Usuario(null, "Adriana", "adrianafsamaral@gmail.com", "123456");
		
		usuarioRepository.saveAll(Arrays.asList(us));
		clienteRepository.saveAll(Arrays.asList(cli));
		
	}
	
}

