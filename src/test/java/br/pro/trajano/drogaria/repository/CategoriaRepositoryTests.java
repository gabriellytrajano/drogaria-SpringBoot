package br.pro.trajano.drogaria.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.pro.trajano.drogaria.domain.Categoria;
import br.pro.trajano.drogaria.domain.repository.CategoriaRepository;


@SpringBootTest
public class CategoriaRepositoryTests {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Test
	public void inserir() {
		Categoria c1 = new Categoria(null, "Bebida");
		
		categoriaRepository.save(c1);
	}
	
	

}
