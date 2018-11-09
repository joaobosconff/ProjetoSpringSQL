package projeto.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import projeto.domain.entities.Produto;

@Repository
public interface ProdutoRep extends MongoRepository<Produto, String>{
		
		Produto findByNome(String nome);
}
