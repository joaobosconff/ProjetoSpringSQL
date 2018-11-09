package br.cesed.unifacisa.lti.ProjetoSpringSQL.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.cesed.unifacisa.lti.ProjetoSpringSQL.Abstracts.ControllerAbs;
import br.cesed.unifacisa.lti.ProjetoSpringSQL.Services.ProdutoServ;
import br.cesed.unifacisa.lti.ProjetoSpringSQL.domain.entities.Produto;


@RestController
@RequestMapping("/Produto")
public class ProdutoController extends ControllerAbs<Produto>{
	@Autowired
	public ProdutoController(ProdutoServ service) {
		super(service);
		
	}
}
