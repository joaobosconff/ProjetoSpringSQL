package br.cesed.unifacisa.lti.ProjetoSpringSQL.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.cesed.unifacisa.lti.ProjetoSpringSQL.Abstracts.ServiceAbs;
import br.cesed.unifacisa.lti.ProjetoSpringSQL.domain.entities.Usuario;
import br.cesed.unifacisa.lti.ProjetoSpringSQL.Repositories.UsuarioRep;


@Service
public class UsuarioServ extends ServiceAbs<Usuario>{
	
	@Autowired
	public UsuarioServ(UsuarioRep repository) {
		super(repository);
		
	}

}
