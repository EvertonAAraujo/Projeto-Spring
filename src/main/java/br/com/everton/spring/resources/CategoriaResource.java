package br.com.everton.spring.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.everton.spring.domain.Categoria;

//Classe que será um controlador REST e irá responder pelo end point /categorias
@RestController
@RequestMapping(value="/categorias") //nome do end point rest
public class CategoriaResource {

	@RequestMapping(method=RequestMethod.GET) //Função REST. GET = requisição para obter dados
	public List<Categoria> listar() {
		
		Categoria cat1 = new Categoria(1, "Informática");
		Categoria cat2 = new Categoria(2, "Escritório");
		
		List<Categoria> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
		
		return lista;
	}
}
