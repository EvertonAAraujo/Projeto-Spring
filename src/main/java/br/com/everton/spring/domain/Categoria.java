package br.com.everton.spring.domain;

import java.io.Serializable;

//Serializable é uma interface que diz que essa classe que os objetos dela poderam ser convertidos para uma sequencia de bites
public class Categoria implements Serializable{		
	private static final long serialVersionUID = 1L;//Por ser serializable precisa dizer qual a versão
	
	private Integer id;
	private String nome;
	
	//Instancia objeto sem jogar nada para atributos
	public Categoria() {
		
	}

	public Categoria(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	//Getters e Setters são métodos de acesso aos atributos da clase
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	//Para que dois objetos sejam comparados por conteudo e não pelo ponteiro de memória
	
	//Método que gera código númerico para cada objeto
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	//Faz a comparação entre dois objetos
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
