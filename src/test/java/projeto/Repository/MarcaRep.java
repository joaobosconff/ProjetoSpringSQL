package projeto.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import projeto.domain.entities.Marca;

@Repository
public interface MarcaRep extends MongoRepository<Marca, String>{

}
