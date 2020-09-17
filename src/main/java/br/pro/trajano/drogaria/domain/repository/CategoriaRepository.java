package br.pro.trajano.drogaria.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.pro.trajano.drogaria.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Short>{
	
	public List<Categoria> findByNome(String nome);

}
