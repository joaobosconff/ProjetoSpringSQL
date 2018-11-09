package br.cesed.unifacisa.lti.ProjetoSpringSQL.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.cesed.unifacisa.lti.ProjetoSpringSQL.Abstracts.ControllerAbs;
import br.cesed.unifacisa.lti.ProjetoSpringSQL.Services.CategoriaServ;
import br.cesed.unifacisa.lti.ProjetoSpringSQL.domain.entities.Categoria;


@RestController
@RequestMapping("/Categoria")
public class CategoriaController extends ControllerAbs<Categoria>{
	@Autowired
	public CategoriaController(CategoriaServ service) {
		super(service);
		
	}
}
