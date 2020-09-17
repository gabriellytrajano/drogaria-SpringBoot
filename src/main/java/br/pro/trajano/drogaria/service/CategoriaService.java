package br.pro.trajano.drogaria.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.pro.trajano.drogaria.domain.Categoria;
import br.pro.trajano.drogaria.domain.repository.CategoriaRepository;
import br.pro.trajano.drogaria.exception.RecursoNaoEncontradoException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria buscarPorCodigo(Short codigo) {
		Optional<Categoria> categoria = categoriaRepository.findById(codigo);
		
		if (categoria.isEmpty()) {
			throw new RecursoNaoEncontradoException();
		}
		
		return categoria.get();
	}


}
