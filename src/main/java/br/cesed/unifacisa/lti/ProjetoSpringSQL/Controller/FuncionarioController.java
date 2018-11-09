package br.cesed.unifacisa.lti.ProjetoSpringSQL.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projeto.Abstracts.ControllerAbs;
import projeto.Service.FuncionarioServ;
import projeto.domain.entities.Funcionario;


@RestController
@RequestMapping("/Funcionario")
public class FuncionarioController extends ControllerAbs<Funcionario>{
	@Autowired
	public FuncionarioController(FuncionarioServ service) {
		super(service);
		
	}
}
