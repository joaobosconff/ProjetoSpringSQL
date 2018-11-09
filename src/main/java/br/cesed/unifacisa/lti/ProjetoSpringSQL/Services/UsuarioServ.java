package br.cesed.unifacisa.lti.ProjetoSpringSQL.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projeto.Abstracts.ServiceAbs;
import projeto.domain.entities.Usuario;
import projeto.Repository.UsuarioRep;


@Service
public class UsuarioServ extends ServiceAbs<Usuario>{
	
	@Autowired
	public UsuarioServ(UsuarioRep repository) {
		super(repository);
		
	}

}
