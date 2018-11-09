package br.cesed.unifacisa.lti.ProjetoSpringSQL.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.cesed.unifacisa.lti.ProjetoSpringSQL.Abstracts.ControllerAbs;
import br.cesed.unifacisa.lti.ProjetoSpringSQL.Services.ClienteServ;
import br.cesed.unifacisa.lti.ProjetoSpringSQL.domain.entities.Cliente;


@RestController
@RequestMapping("/Cliente")
public class ClienteController extends ControllerAbs<Cliente>{
	@Autowired
	public ClienteController(ClienteServ service) {
		super(service);
		
	}
}