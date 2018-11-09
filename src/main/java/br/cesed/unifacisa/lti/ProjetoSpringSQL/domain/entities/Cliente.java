package br.cesed.unifacisa.lti.ProjetoSpringSQL.domain.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;

import org.springframework.data.annotation.Id;

import br.cesed.unifacisa.lti.ProjetoSpringSQL.Interfaces.Identificable;



@Entity
public class Cliente implements Identificable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private Long telefone;
	@OneToOne
	private Venda venda;
	
	
	@OneToOne
	private Endereco endereco;
	
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getTelefone() {
		return telefone;
	}
	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}
