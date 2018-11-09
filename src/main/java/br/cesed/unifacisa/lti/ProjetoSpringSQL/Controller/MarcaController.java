package br.cesed.unifacisa.lti.ProjetoSpringSQL.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projeto.Abstracts.ControllerAbs;
import projeto.Service.MarcaServ;
import projeto.domain.entities.Marca;


@RestController
@RequestMapping("/Marca")
public class MarcaController extends ControllerAbs<Marca>{
	@Autowired
	public MarcaController(MarcaServ service) {
		super(service);
		
	}
}