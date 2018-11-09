package br.cesed.unifacisa.lti.ProjetoSpringSQL.Abstracts;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import br.cesed.unifacisa.lti.ProjetoSpringSQL.Exceptions.erro;
import br.cesed.unifacisa.lti.ProjetoSpringSQL.Interfaces.Identificable;


public abstract class ServiceAbs <T extends Identificable>{
	
	protected JpaRepository<T,Long> repository;
	
	public ServiceAbs(JpaRepository<T,Long> repository) {
		this.repository = repository;
	}
	
	public List<T> getAll() {  //READ ALL
		return repository.findAll();
	}
	
	public T getById(Long id) { //READ BY ID
		return repository.findById(id).get() ;
	}
	
	public T add(T t) { // ADD 
		return repository.save(t);
		
	}
	
	public T atualiza( T t) throws erro{ // ATUALIZA
		if (repository.existsById(t.getId())) {
			return repository.save(t);
		}throw new erro("Id não encontrado!!");
	}
	
	
	public void deleta( Long id ) throws erro { // DELETE
		if (repository.existsById(id)) {
			repository.deleteById(id); 
		}else{
			throw new erro("Não foi apagado!! ID errado ou não existe"); 
		}
	}
		
}
