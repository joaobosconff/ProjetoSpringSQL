package br.cesed.unifacisa.lti.ProjetoSpringSQL.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projeto.Abstracts.ControllerAbs;
import projeto.Service.VendaServ;
import projeto.domain.entities.Venda;


@RestController
@RequestMapping("/Venda")
public class VendaController extends ControllerAbs<Venda>{
	@Autowired
	public VendaController(VendaServ service) {
		super(service);
		
	}
}