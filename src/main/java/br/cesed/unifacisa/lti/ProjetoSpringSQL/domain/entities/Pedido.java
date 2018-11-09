package br.cesed.unifacisa.lti.ProjetoSpringSQL.domain.entities;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Pedido {
	
	private int quantidade;
	@DBRef
	private Produto produto;
	private Double valorTotalPedido;
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Double getValorTotalPedido() {
		return valorTotalPedido;
	}
	public void setValorTotalPedido(Double valorTotalPedido) {
		this.valorTotalPedido = valorTotalPedido;
	}
	
}
