package br.cesed.unifacisa.lti.ProjetoSpringSQL.domain.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.validation.constraints.Positive;
import javax.persistence.Id;



@Entity
public class Pedido {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Positive(message="{number}")
	private int quantidade;
	
	@OneToMany
	private List<Produto> produto;
	
	@Positive(message="{number}")
	private Double valorTotalPedido;
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public Double getValorTotalPedido() {
		return valorTotalPedido;
	}
	public void setValorTotalPedido(Double valorTotalPedido) {
		this.valorTotalPedido = valorTotalPedido;
	}
	
}
