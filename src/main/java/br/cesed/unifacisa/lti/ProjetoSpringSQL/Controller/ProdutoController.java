package br.cesed.unifacisa.lti.ProjetoSpringSQL.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projeto.Abstracts.ControllerAbs;
import projeto.Service.ProdutoServ;
import projeto.domain.entities.Produto;


@RestController
@RequestMapping("/Produto")
public class ProdutoController extends ControllerAbs<Produto>{
	@Autowired
	public ProdutoController(ProdutoServ service) {
		super(service);
		
	}
}
