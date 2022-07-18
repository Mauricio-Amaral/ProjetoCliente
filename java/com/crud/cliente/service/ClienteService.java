package com.crud.cliente.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

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
	
	public Cliente findById(Integer id) {
		Optional<Cliente> optional = clienteRepository.findById(id);
		return optional.orElse(null);
	}
	
	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}
	
	public Cliente update(Integer id, @Valid ClienteDTO clienteDTO) {
		clienteDTO.setId(id);
		Cliente cli = findById(id);
		cli = new Cliente(clienteDTO);
		return clienteRepository.save(cli);
	}
	
	public void delete(Integer id) {
		Cliente cli = findById(id);
		clienteRepository.deleteById(id);
	}

}
