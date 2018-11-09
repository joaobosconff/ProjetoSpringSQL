package br.cesed.unifacisa.lti.ProjetoSpringSQL.domain.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import projeto.Interfaces.Identificable;

@Document
public class Marca implements Identificable{
	
	@Id
	private String id;
	private String nome;
	private Fornecedor fornecedor;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
}