package projeto.domain.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import projeto.Interfaces.Identificable;

@Document
public class Categoria implements Identificable{
	@Id
	private String id;
	private String nome;
	
	
	public String getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
