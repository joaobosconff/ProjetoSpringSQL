package br.cesed.unifacisa.lti.ProjetoSpringSQL.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import projeto.domain.entities.Cliente;

@Repository
public interface ClienteRep extends JpaRepository<Cliente, String> {

}
