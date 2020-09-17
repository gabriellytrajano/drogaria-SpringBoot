package br.pro.trajano.drogaria.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.pro.trajano.drogaria.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
