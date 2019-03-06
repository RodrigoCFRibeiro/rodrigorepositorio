package br.com.caelum.projetos.commands.carrinho;

import java.util.List;

import br.com.caelum.projetos.commands.Command;
import br.com.caelum.projetos.main.Projeto;
import br.com.caelum.projetos.modelo.Produto;

public class CarrinhoListarCommand implements Command<List<Produto>> {

	private Produto produtoCestaV;

	public List<Produto> call() {

		return Projeto.LISTA_PRODUTO;

	}

	public Produto getProdutoCestaV() {
		return produtoCestaV;
	}

	public void setProdutoCestaV(Produto produtoCestaV) {
		this.produtoCestaV = produtoCestaV;
	}

}
