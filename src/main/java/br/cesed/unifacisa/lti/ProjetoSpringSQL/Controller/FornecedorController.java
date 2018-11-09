package br.cesed.unifacisa.lti.ProjetoSpringSQL.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.cesed.unifacisa.lti.ProjetoSpringSQL.Abstracts.ControllerAbs;
import br.cesed.unifacisa.lti.ProjetoSpringSQL.Services.FornecedorServ;
import br.cesed.unifacisa.lti.ProjetoSpringSQL.domain.entities.Fornecedor;


@RestController
@RequestMapping("/Fornecedor")
public class FornecedorController extends ControllerAbs<Fornecedor>{
	@Autowired
	public FornecedorController(FornecedorServ service) {
		super(service);
		
	}
}
