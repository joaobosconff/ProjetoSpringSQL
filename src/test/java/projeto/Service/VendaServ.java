package projeto.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projeto.Abstracts.ServiceAbs;
import projeto.domain.entities.Venda;
import projeto.Repository.VendaRep;


@Service
public class VendaServ extends ServiceAbs<Venda>{
	
	@Autowired
	public VendaServ(VendaRep repository) {
		super(repository);
		
	}

}
