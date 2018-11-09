package projeto.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import projeto.domain.entities.Cliente;

@Repository
public interface ClienteRep extends MongoRepository<Cliente, String> {

}
