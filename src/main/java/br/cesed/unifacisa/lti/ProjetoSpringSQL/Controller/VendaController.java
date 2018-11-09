package br.cesed.unifacisa.lti.ProjetoSpringSQL.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.cesed.unifacisa.lti.ProjetoSpringSQL.Abstracts.ControllerAbs;
import br.cesed.unifacisa.lti.ProjetoSpringSQL.Services.VendaServ;
import br.cesed.unifacisa.lti.ProjetoSpringSQL.domain.entities.Venda;


@RestController
@RequestMapping("/Venda")
public class VendaController extends ControllerAbs<Venda>{
	@Autowired
	public VendaController(VendaServ service) {
		super(service);
		
	}
}