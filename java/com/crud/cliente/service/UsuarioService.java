package com.crud.cliente.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.cliente.entities.Usuario;
import com.crud.cliente.entities.dto.UsuarioDTO;
import com.crud.cliente.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuario create(UsuarioDTO usuarioDTO) {
		usuarioDTO.setId(null);
		validaEmail(usuarioDTO);
		Usuario us = new Usuario(usuarioDTO);
		return usuarioRepository.save(us);
	}
	
	private void validaEmail(UsuarioDTO usuarioDTO) {
		Optional<Usuario> optional = usuarioRepository.findByEmail(usuarioDTO.getEmail());
		if (optional.isPresent()) {
		throw new DataIntegrityViolationExceptions("Email cadastrado");
		}
	}
	
	public Usuario findById(Integer id) {
		Optional<Usuario> optional = usuarioRepository.findById(id);
		return optional.orElse(null);
	}

}
