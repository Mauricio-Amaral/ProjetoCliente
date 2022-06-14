package com.crud.cliente.entities;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.crud.cliente.entities.dto.UsuarioDTO;

@Entity
public class Usuario {

	@Id
	private Integer id;
	private String nome;
	private String email;
	private String senha;
	private LocalDate dataCriacao = LocalDate.now();

	public Usuario(UsuarioDTO usuarioDTO) {
		super();
		this.id = usuarioDTO.getId();
		this.nome = usuarioDTO.getNome();
		this.email = usuarioDTO.getEmail();
		this.senha = usuarioDTO.getSenha();
	}

	public Usuario(Integer id, String nome, String email, String senha) {
		super();
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(id, other.id);
	}
	
}
