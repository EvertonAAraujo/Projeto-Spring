package br.com.everton.spring.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Classe que será um controlador REST e irá responder pelo end point /categorias
@RestController
@RequestMapping(value="/categorias") //nome do end point rest
public class CategoriaResource {

	@RequestMapping(method=RequestMethod.GET) //Função REST. GET = requisição para obter dados
	public String listar() {
		return "REST está funcionando";
	}
}
