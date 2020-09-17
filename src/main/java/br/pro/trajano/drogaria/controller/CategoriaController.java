package br.pro.trajano.drogaria.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.pro.trajano.drogaria.domain.Categoria;
import br.pro.trajano.drogaria.domain.repository.CategoriaRepository;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@GetMapping
	public List<Categoria> listar(){
		List<Categoria> categorias = categoriaRepository.findAll();
		return categorias;
		
	}
	
	@GetMapping("/{codigo}")
	public Categoria buscarPorCodigo(@PathVariable Short codigo) {
		Optional<Categoria> categoria = categoriaRepository.findById(codigo);
		return categoria.get();
	}
	
	@GetMapping("/nome/{nome}")
	public List<Categoria> buscarPorNome(@PathVariable String nome) {
		List<Categoria> categoria = categoriaRepository.findByNome(nome);
		return categoria;
		
	}
	
	@PostMapping
	@ResponseBody
	public Categoria inserir(@RequestBody Categoria categoria) {
		Categoria categoriaSalva = categoriaRepository.save(categoria);
		return categoriaSalva;
	}

	@DeleteMapping("/{codigo}")
	public Optional<Categoria> excluir(@PathVariable Short codigo) {
		Optional<Categoria> categoria = categoriaRepository.findById(codigo);
		categoriaRepository.delete(categoria.get());
		return categoria;
	}
	
	@PutMapping
	@ResponseBody
	public void editar(@RequestBody Categoria categoria) {
		categoriaRepository.save(categoria);
	}
	
	
	
	
}
