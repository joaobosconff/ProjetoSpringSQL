package br.cesed.unifacisa.lti.ProjetoSpringSQL.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.cesed.unifacisa.lti.ProjetoSpringSQL.domain.entities.Pedido;

public interface PedidoRep extends JpaRepository<Pedido, Long> {

}
