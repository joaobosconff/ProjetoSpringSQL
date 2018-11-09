package projeto.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import projeto.domain.entities.Venda;

@Repository
public interface VendaRep extends MongoRepository<Venda, String >{

}
