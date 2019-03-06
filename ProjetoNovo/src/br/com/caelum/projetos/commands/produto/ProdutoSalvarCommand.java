package br.com.caelum.projetos.commands.produto;

import java.util.List;
import java.util.Scanner;

import br.com.caelum.projetos.commands.Command;
import br.com.caelum.projetos.modelo.Produto;

public class ProdutoSalvarCommand implements Command<Produto> {

	private Produto produto;
	Scanner SC = new Scanner(System.in);

	public Produto call() {

		ProdutoListarCommand cmdListaProduto = new ProdutoListarCommand();

		List<Produto> produtos = cmdListaProduto.call();

		produtos.add(produto);

		
		return produto;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public void setVenda(ProdutoListarCommand prod) {

	}

}
