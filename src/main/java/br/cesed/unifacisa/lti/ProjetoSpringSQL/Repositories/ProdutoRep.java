package br.cesed.unifacisa.lti.ProjetoSpringSQL.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import projeto.domain.entities.Produto;

@Repository
public interface ProdutoRep extends JpaRepository<Produto, String>{
		
		Produto findByNome(String nome);
}
