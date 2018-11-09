package br.cesed.unifacisa.lti.ProjetoSpringSQL.domain.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;

import org.springframework.data.annotation.Id;

import br.cesed.unifacisa.lti.ProjetoSpringSQL.Interfaces.Identificable;

@Entity
public class Categoria implements Identificable{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToMany
	private List<Produto> produtos;
	
	private String nome;
	
	
	
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
