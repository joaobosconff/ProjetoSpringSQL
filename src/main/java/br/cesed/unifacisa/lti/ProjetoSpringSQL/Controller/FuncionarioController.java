package br.cesed.unifacisa.lti.ProjetoSpringSQL.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.cesed.unifacisa.lti.ProjetoSpringSQL.Abstracts.ControllerAbs;
import br.cesed.unifacisa.lti.ProjetoSpringSQL.Services.FuncionarioServ;
import br.cesed.unifacisa.lti.ProjetoSpringSQL.domain.entities.Funcionario;


@RestController
@RequestMapping("/Funcionario")
public class FuncionarioController extends ControllerAbs<Funcionario>{
	@Autowired
	public FuncionarioController(FuncionarioServ service) {
		super(service);
		
	}
}
