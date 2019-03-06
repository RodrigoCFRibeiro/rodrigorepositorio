package br.com.caelum.projetos.modelo;

import java.util.List;

public class Item {

	private Produto produto;

	private double quantidade;

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public void setIdProduto(int i) {
		// TODO Auto-generated method stub

	}

	public void setNomeProduto(String string) {
		// TODO Auto-generated method stub

	}

	public void setPreco(double d) {
		// TODO Auto-generated method stub

	}

	public void setDescricao(String string) {
		// TODO Auto-generated method stub

	}

	public void setQuantidade(List<Produto> produtos) {
		// TODO Auto-generated method stub

	}

	public void setQuantidade(Produto prod) {
		// TODO Auto-generated method stub

	}

	public String toString() {
		return produto + "   " + quantidade;
	}

	public String getDescricao() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getIdProduto() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getNomeProduto() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPreco() {
		// TODO Auto-generated method stub
		return null;
	}

}