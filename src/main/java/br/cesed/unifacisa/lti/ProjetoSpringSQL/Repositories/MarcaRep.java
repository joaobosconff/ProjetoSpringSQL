package br.cesed.unifacisa.lti.ProjetoSpringSQL.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.cesed.unifacisa.lti.ProjetoSpringSQL.domain.entities.Marca;

@Repository
public interface MarcaRep extends JpaRepository<Marca, Long>{

}
