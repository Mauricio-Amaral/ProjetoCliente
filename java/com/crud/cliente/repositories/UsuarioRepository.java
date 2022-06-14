package com.crud.cliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.cliente.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
