package com.crud.cliente.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.cliente.entities.Cliente;
import com.crud.cliente.entities.dto.ClienteDTO;
import com.crud.cliente.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente create(ClienteDTO clienteDTO) {
		clienteDTO.setId(null);
		validaCpf(clienteDTO);
		Cliente cli = new Cliente(clienteDTO);
		return clienteRepository.save(cli);
	}
	
	private void validaCpf(ClienteDTO clienteDTO) {
		Optional<Cliente> optional = clienteRepository.findByCpf(clienteDTO.getCpf());
		if (optional.isPresent()) {
		throw new DataIntegrityViolationExceptions("CPF cadastrado");
		}
	}

}
