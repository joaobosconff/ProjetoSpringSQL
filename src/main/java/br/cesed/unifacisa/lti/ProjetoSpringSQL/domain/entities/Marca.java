package br.cesed.unifacisa.lti.ProjetoSpringSQL.domain.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;

import org.springframework.data.annotation.Id;


import br.cesed.unifacisa.lti.ProjetoSpringSQL.Interfaces.Identificable;

@Entity
public class Marca implements Identificable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nome;
	private Fornecedor fornecedor;
	@OneToMany
	private List<Produto> produtos;
	
	
	
	
	
	
	
	
	
	
	
	public Long getId() {
		return id;
	}
	public void Long(Long id) {
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
