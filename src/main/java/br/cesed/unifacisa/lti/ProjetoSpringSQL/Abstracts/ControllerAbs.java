package br.cesed.unifacisa.lti.ProjetoSpringSQL.Abstracts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import projeto.Exception.erro;
import projeto.Interfaces.Identificable;


public abstract class ControllerAbs<A extends Identificable> {
	
	@Autowired
	protected ServiceAbs<A> service;
	
	public ControllerAbs(ServiceAbs<A> service) {
		this.service = service;
	}
	
	@GetMapping("/")
	public List<A> getAll(){ // READ ALL
		return service.getAll();
	}
	
	
	@GetMapping("/{id}") //READ BY ID
	public ResponseEntity<A> getById(@PathVariable String id) {
		service.getById(id);
		return new ResponseEntity<A>(service.getById(id),HttpStatus.OK);
	}
	
	@PostMapping("/")
	public ResponseEntity<A> addA(@RequestBody A a) { //ADD A
		service.add(a);
		return new ResponseEntity<A>(a,HttpStatus.CREATED);
	}
	
	@PutMapping("/")
	public ResponseEntity<A> Atualiza(@RequestBody A a) throws erro { // ATUALIZA 
		if (service.atualiza(a).equals(a)) {
			service.atualiza(a);
			return new ResponseEntity<A>(service.atualiza(a),HttpStatus.OK);
		}throw new erro("Não foi apagado!! ID errado ou não existe");
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delA(@PathVariable String id) throws erro{ // DELETA A
		service.deleta(id);
		return new ResponseEntity<String>("DELETADO",HttpStatus.OK);
	}
}
