package br.cesed.unifacisa.lti.ProjetoSpringSQL.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.cesed.unifacisa.lti.ProjetoSpringSQL.domain.entities.Usuario;

@Repository
public interface UsuarioRep extends JpaRepository<Usuario, Long>{

}
