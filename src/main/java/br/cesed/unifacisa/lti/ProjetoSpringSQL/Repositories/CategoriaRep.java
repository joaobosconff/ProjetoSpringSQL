package br.cesed.unifacisa.lti.ProjetoSpringSQL.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.cesed.unifacisa.lti.ProjetoSpringSQL.domain.entities.Categoria;

@Repository
public interface CategoriaRep extends JpaRepository<Categoria, Long>{

}
