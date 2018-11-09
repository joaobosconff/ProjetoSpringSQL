package br.cesed.unifacisa.lti.ProjetoSpringSQL.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projeto.Abstracts.ServiceAbs;
import projeto.domain.entities.Marca;
import projeto.Repository.MarcaRep;


@Service
public class MarcaServ extends ServiceAbs<Marca>{
	
	@Autowired
	public MarcaServ(MarcaRep repository) {
		super(repository);
		
	}

}
