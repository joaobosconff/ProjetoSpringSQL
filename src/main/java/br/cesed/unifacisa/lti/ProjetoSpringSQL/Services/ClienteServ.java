package br.cesed.unifacisa.lti.ProjetoSpringSQL.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projeto.Abstracts.ServiceAbs;
import projeto.domain.entities.Cliente;
import projeto.Repository.ClienteRep;


@Service
public class ClienteServ extends ServiceAbs<Cliente>{
	
	@Autowired
	public ClienteServ(ClienteRep repository) {
		super(repository);
		
	}

}
