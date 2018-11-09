package br.cesed.unifacisa.lti.ProjetoSpringSQL.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.cesed.unifacisa.lti.ProjetoSpringSQL.domain.entities.Endereco;

public interface EnderecoRep extends JpaRepository<Endereco, Long> {
	

}
