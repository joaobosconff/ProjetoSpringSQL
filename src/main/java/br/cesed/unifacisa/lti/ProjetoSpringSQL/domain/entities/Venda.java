package br.cesed.unifacisa.lti.ProjetoSpringSQL.domain.entities;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import projeto.Interfaces.Identificable;

@Document
public class Venda implements Identificable{
	@Id
	private String id;
	@DBRef
	private Cliente cliente;
	@DBRef
	private Funcionario funcionario;
	private Double valorTotal;
	private ArrayList<Pedido> pedidos;
	
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	public String getId() {
		return id;
	}
	
}
