package com.crud.cliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.cliente.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
