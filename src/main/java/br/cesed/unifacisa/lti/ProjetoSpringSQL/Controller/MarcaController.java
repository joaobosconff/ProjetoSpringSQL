package br.cesed.unifacisa.lti.ProjetoSpringSQL.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.cesed.unifacisa.lti.ProjetoSpringSQL.Abstracts.ControllerAbs;
import br.cesed.unifacisa.lti.ProjetoSpringSQL.Services.MarcaServ;
import br.cesed.unifacisa.lti.ProjetoSpringSQL.domain.entities.Marca;


@RestController
@RequestMapping("/Marca")
public class MarcaController extends ControllerAbs<Marca>{
	@Autowired
	public MarcaController(MarcaServ service) {
		super(service);
		
	}
}