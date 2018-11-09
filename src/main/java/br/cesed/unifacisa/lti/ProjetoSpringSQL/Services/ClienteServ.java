package br.cesed.unifacisa.lti.ProjetoSpringSQL.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.cesed.unifacisa.lti.ProjetoSpringSQL.Abstracts.ServiceAbs;
import br.cesed.unifacisa.lti.ProjetoSpringSQL.domain.entities.Cliente;
import br.cesed.unifacisa.lti.ProjetoSpringSQL.Repositories.ClienteRep;


@Service
public class ClienteServ extends ServiceAbs<Cliente>{
	
	@Autowired
	public ClienteServ(ClienteRep repository) {
		super(repository);
		
	}

}
