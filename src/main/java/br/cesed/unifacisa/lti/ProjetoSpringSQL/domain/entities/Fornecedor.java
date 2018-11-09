package br.cesed.unifacisa.lti.ProjetoSpringSQL.domain.entities;

import java.time.LocalDate;

import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Fornecedor {
	
	private String nome;
	private Long telefone;
	private String email;
	private String cnpj;
	private LocalDate dataDeContrato;
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
	
}
