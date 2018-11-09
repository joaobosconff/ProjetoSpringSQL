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

import br.cesed.unifacisa.lti.ProjetoSpringSQL.Exceptions.erro;
import br.cesed.unifacisa.lti.ProjetoSpringSQL.Interfaces.Identificable;


public abstract class ControllerAbs<T extends Identificable> {
	
	@Autowired
	protected ServiceAbs<T> service;
	
	public ControllerAbs(ServiceAbs<T> service) {
		this.service = service;
	}
	
	@GetMapping("/")
	public List<T> getAll(){ // READ ALL
		return service.getAll();
	}
	
	
	@GetMapping("/{id}") //READ BY ID
	public ResponseEntity<T> getById(@PathVariable Long id) {
		service.getById(id);
		return new ResponseEntity<T>(service.getById(id),HttpStatus.OK);
	}
	
	@PostMapping("/")
	public ResponseEntity<T> addA(@RequestBody T a) { //ADD A
		service.add(a);
		return new ResponseEntity<T>(a,HttpStatus.CREATED);
	}
	
	@PutMapping("/")
	public ResponseEntity<T> Atualiza(@RequestBody T a) throws erro { // ATUALIZA 
		if (service.atualiza(a).equals(a)) {
			service.atualiza(a);
			return new ResponseEntity<T>(service.atualiza(a),HttpStatus.OK);
		}throw new erro("Não foi apagado!! ID errado ou não existe");
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delA(@PathVariable Long id) throws erro{ // DELETA A
		service.deleta(id);
		return new ResponseEntity<String>("DELETADO",HttpStatus.OK);
	}
}
