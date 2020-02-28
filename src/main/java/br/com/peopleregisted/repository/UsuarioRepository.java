package br.com.peopleregisted.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.peopleregisted.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
