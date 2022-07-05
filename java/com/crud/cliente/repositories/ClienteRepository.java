package com.crud.cliente.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.cliente.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	
	Optional<Cliente> findByCpf(String cpf);

}
