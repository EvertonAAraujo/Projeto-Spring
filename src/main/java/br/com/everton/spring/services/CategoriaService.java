package br.com.everton.spring.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.everton.spring.domain.Categoria;
import br.com.everton.spring.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired //Dependencia automaticamente instanciada pelo spring
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id); //Objeto container que carrega obj do tipo que for enviado para ele
		
		return obj.orElse(null);
	}

}
