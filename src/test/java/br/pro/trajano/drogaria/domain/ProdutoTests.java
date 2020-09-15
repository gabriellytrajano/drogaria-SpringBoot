package br.pro.trajano.drogaria.domain;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProdutoTests {
	
	@Test
	public void criar() {
		Produto p = new Produto(1, "Coca cola", 2, 10.5, null);
		
	}

}
