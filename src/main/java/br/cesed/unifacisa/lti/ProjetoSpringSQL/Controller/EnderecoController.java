package br.cesed.unifacisa.lti.ProjetoSpringSQL.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.cesed.unifacisa.lti.ProjetoSpringSQL.Abstracts.ControllerAbs;
import br.cesed.unifacisa.lti.ProjetoSpringSQL.Services.EnderecoServ;
import br.cesed.unifacisa.lti.ProjetoSpringSQL.domain.entities.Endereco;


@RestController
@RequestMapping("/Endereco")
public class EnderecoController extends ControllerAbs<Endereco>{
	@Autowired
	public EnderecoController(EnderecoServ service) {
		super(service);
		
	}
}