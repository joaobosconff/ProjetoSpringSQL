package projeto.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projeto.Abstracts.ControllerAbs;
import projeto.Service.ClienteServ;
import projeto.domain.entities.Cliente;


@RestController
@RequestMapping("/Cliente")
public class ClienteController extends ControllerAbs<Cliente>{
	@Autowired
	public ClienteController(ClienteServ service) {
		super(service);
		
	}
}