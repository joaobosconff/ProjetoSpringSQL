package projeto.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projeto.Abstracts.ServiceAbs;
import projeto.domain.entities.Produto;
import projeto.Repository.ProdutoRep;


@Service
public class ProdutoServ extends ServiceAbs<Produto>{
	
	@Autowired
	public ProdutoServ(ProdutoRep repository) {
		super(repository);
		
	}

}

