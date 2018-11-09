package br.cesed.unifacisa.lti.ProjetoSpringSQL.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.cesed.unifacisa.lti.ProjetoSpringSQL.domain.entities.Produto;

@Repository
public interface ProdutoRep extends JpaRepository<Produto, Long>{
		
		Produto findByNome(String nome);
}
