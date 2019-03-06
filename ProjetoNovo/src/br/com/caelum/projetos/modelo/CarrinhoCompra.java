package br.com.caelum.projetos.modelo;

import java.util.List;

public class CarrinhoCompra {

	private Produto produto;

	public boolean autentica(Produto produto) {
		if (this.produto == produto) {
			System.out.println("nomeProduto" + "" + "precoProduto" + "" + "descricaoProduto");
			return true;
		} else {
			System.out.println("nao existe produto");
			return false;
		}

	}

	public void serIdCarrinhoCompra(int i) {
		// TODO Auto-generated method stub

	}

	public void setProduto(List<Produto> produtoCestas) {
		// TODO Auto-generated method stub

	}

	public String getIdProduto() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getDescricao() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getQuantidade() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPreco() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getNomeProduto() {
		// TODO Auto-generated method stub
		return null;
	}

}
