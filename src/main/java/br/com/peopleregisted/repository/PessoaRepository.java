package br.com.peopleregisted.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.peopleregisted.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
	

}
