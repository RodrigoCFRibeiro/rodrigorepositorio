package br.com.caelum.projetos.modelo;

import java.util.List;


public class Venda {
	
	;
	
	private int id;
	private Cliente cliente;
	private Funcionario funcionario;
	private List<Item> itens;
	private double valorTotal;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente clienteC) {
		this.cliente = clienteC;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	public void setCliente(String clienteC) {
		// TODO Auto-generated method stub

	}

	public String toString() {
		return String.format("  " +itens + "  ");

	}

	public String getNomeProduto() {
		// TODO Auto-generated method stub
		return null;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

}
