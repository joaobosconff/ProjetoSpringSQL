package br.cesed.unifacisa.lti.ProjetoSpringSQL.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projeto.Abstracts.ServiceAbs;
import projeto.domain.entities.Funcionario;
import projeto.Repository.FuncionarioRep;


@Service
public class FuncionarioServ extends ServiceAbs<Funcionario>{
	
	@Autowired
	public FuncionarioServ(FuncionarioRep repository) {
		super(repository);
		
	}

}

