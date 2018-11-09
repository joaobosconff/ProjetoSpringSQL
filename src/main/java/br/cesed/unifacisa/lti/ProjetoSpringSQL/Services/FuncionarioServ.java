package br.cesed.unifacisa.lti.ProjetoSpringSQL.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.cesed.unifacisa.lti.ProjetoSpringSQL.Abstracts.ServiceAbs;
import br.cesed.unifacisa.lti.ProjetoSpringSQL.domain.entities.Funcionario;
import br.cesed.unifacisa.lti.ProjetoSpringSQL.Repositories.FuncionarioRep;


@Service
public class FuncionarioServ extends ServiceAbs<Funcionario>{
	
	@Autowired
	public FuncionarioServ(FuncionarioRep repository) {
		super(repository);
		
	}

}

