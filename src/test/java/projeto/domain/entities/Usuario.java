package projeto.domain.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import projeto.Interfaces.Identificable;

@Document
public class Usuario implements Identificable{
	
	@Id
	private String id;
	private String matriculaFuncionario;
	private String senha;
	
	
	public String getMatriculaFuncionario() {
		return matriculaFuncionario;
	}
	public void setMatriculaFuncionario(String matriculaFuncionario) {
		this.matriculaFuncionario = matriculaFuncionario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getId() {
		return id;
	}
	
	
}
