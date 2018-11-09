package br.cesed.unifacisa.lti.ProjetoSpringSQL.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.cesed.unifacisa.lti.ProjetoSpringSQL.Abstracts.ServiceAbs;
import br.cesed.unifacisa.lti.ProjetoSpringSQL.domain.entities.Produto;
import br.cesed.unifacisa.lti.ProjetoSpringSQL.Repositories.ProdutoRep;


@Service
public class ProdutoServ extends ServiceAbs<Produto>{
	
	@Autowired
	public ProdutoServ(ProdutoRep repository) {
		super(repository);
		
	}

}

