package br.com.caelum.projetos.modelo;

public class Produto {

	private int idProduto;
	private String nomeProduto;
	private double preco;
	private String descricao;
	private double quantidade;

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;

	}

	public String toString() {
		return idProduto + "   " + nomeProduto + "   " + preco + "   " + descricao + "   " + quantidade;
	}

	public Produto get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
