package projeto.Service;

import org.springframework.stereotype.Service;

import projeto.Abstracts.ServiceAbs;
import projeto.domain.entities.Categoria;
import projeto.Repository.CategoriaRep;


@Service
public class CategoriaServ extends ServiceAbs<Categoria>{
	
	public CategoriaServ(CategoriaRep repository) {
		super(repository);
	}
}
