package br.cesed.unifacisa.lti.ProjetoSpringSQL.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.cesed.unifacisa.lti.ProjetoSpringSQL.Abstracts.ControllerAbs;
import br.cesed.unifacisa.lti.ProjetoSpringSQL.Services.UsuarioServ;
import br.cesed.unifacisa.lti.ProjetoSpringSQL.domain.entities.Usuario;


@RestController
@RequestMapping("/Usuario")
public class UsuarioController extends ControllerAbs<Usuario>{
	@Autowired
	public UsuarioController(UsuarioServ service) {
		super(service);
		
	}
}