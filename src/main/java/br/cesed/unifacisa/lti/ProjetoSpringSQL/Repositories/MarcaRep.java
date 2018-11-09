package br.cesed.unifacisa.lti.ProjetoSpringSQL.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import projeto.domain.entities.Marca;

@Repository
public interface MarcaRep extends JpaRepository<Marca, String>{

}
