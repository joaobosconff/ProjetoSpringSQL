package projeto.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projeto.Abstracts.ControllerAbs;
import projeto.Service.CategoriaServ;
import projeto.domain.entities.Categoria;


@RestController
@RequestMapping("/Categoria")
public class CategoriaController extends ControllerAbs<Categoria>{
	@Autowired
	public CategoriaController(CategoriaServ service) {
		super(service);
		
	}
}
