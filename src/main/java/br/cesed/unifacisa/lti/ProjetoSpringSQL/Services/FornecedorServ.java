package br.cesed.unifacisa.lti.ProjetoSpringSQL.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.cesed.unifacisa.lti.ProjetoSpringSQL.Abstracts.ServiceAbs;
import br.cesed.unifacisa.lti.ProjetoSpringSQL.domain.entities.Fornecedor;
import br.cesed.unifacisa.lti.ProjetoSpringSQL.Repositories.FornecedorRep;


@Service
public class FornecedorServ extends ServiceAbs<Fornecedor>{
	
	@Autowired
	public FornecedorServ(FornecedorRep repository) {
		super(repository);
		
	}

}
