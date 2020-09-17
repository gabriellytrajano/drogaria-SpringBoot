package br.pro.trajano.drogaria.repository;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.pro.trajano.drogaria.domain.Produto;
import br.pro.trajano.drogaria.domain.repository.ProdutoRepository;

@SpringBootTest
public class ProdutoRepositoryTests {
	@Autowired
	private ProdutoRepository produtoRepository;
	@Test
	public void inserir() {
		Produto p1 = new Produto(null, "Coca Cola", 15, 10.50, LocalDate.of(2020, 2, 15), null);
		Produto p2 = new Produto(null, "Fanta Uva", 6, 6.50, LocalDate.of(2020, 4, 11), null);
		
	produtoRepository.save(p1);
	produtoRepository.save(p2);
	
	}
	
}
