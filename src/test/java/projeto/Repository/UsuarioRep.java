package projeto.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import projeto.domain.entities.Usuario;

@Repository
public interface UsuarioRep extends MongoRepository<Usuario, String>{

}
