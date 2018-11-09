package br.cesed.unifacisa.lti.ProjetoSpringSQL.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.cesed.unifacisa.lti.ProjetoSpringSQL.Abstracts.ServiceAbs;
import br.cesed.unifacisa.lti.ProjetoSpringSQL.domain.entities.Endereco;
import br.cesed.unifacisa.lti.ProjetoSpringSQL.Repositories.EnderecoRep;


@Service
public class EnderecoServ extends ServiceAbs<Endereco>{
	
	@Autowired
	public EnderecoServ(EnderecoRep repository) {
		super(repository);
	}
}
