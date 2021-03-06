package br.cesed.unifacisa.lti.ProjetoSpringSQL.domain.entities;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Positive;

import org.hibernate.validator.constraints.br.CNPJ;

import br.cesed.unifacisa.lti.ProjetoSpringSQL.Interfaces.Identificable;



@Entity
public class Fornecedor implements Identificable{
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	@NotBlank(message="{string}")
	private String nome;
	@Positive(message="{number}")
	private Long telefone;
	@Email(message="{string.email}")
	private String email;
	@CNPJ(message="{string.cnpj}")
	private String cnpj;
	@PastOrPresent(message="{data}")
	private LocalDate dataDeContrato;
	@FutureOrPresent(message="{data}")
	private LocalDate vencimentoDeContrato;
	
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public LocalDate getDataDeContrato() {
		return dataDeContrato;
	}
	public void setDataDeContrato(LocalDate dataDeContrato) {
		this.dataDeContrato = dataDeContrato;
	}
	public LocalDate getVencimentoDeContrato() {
		return vencimentoDeContrato;
	}
	public void setVencimentoDeContrato(LocalDate vencimentoDeContrato) {
		this.vencimentoDeContrato = vencimentoDeContrato;
	}
	@Override
	public Long getId() {
		return this.id;
	}
	
}