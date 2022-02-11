package com.hmorales.springboot.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.hmorales.springboot.app.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {

	public Usuario findByUsername(String username);
	
}
