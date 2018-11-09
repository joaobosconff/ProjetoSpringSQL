package projeto.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import projeto.domain.entities.Funcionario;

@Repository
public interface FuncionarioRep extends MongoRepository<Funcionario, String> {

}
