package br.cesed.unifacisa.lti.ProjetoSpringSQL.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.cesed.unifacisa.lti.ProjetoSpringSQL.Abstracts.ServiceAbs;
import br.cesed.unifacisa.lti.ProjetoSpringSQL.domain.entities.Venda;
import br.cesed.unifacisa.lti.ProjetoSpringSQL.Repositories.VendaRep;


@Service
public class VendaServ extends ServiceAbs<Venda>{
	
	@Autowired
	public VendaServ(VendaRep repository) {
		super(repository);
		
	}

}
