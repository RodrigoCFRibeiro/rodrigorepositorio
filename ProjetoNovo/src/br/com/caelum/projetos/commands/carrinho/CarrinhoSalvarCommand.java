package br.com.caelum.projetos.commands.carrinho;

import java.util.List;

import br.com.caelum.projetos.commands.Command;
import br.com.caelum.projetos.modelo.Produto;

public class CarrinhoSalvarCommand implements Command<Produto> {

	private Produto produtoCestaV;

	@Override
	public Produto call() {

		CarrinhoListarCommand cmdListaCarrinho = new CarrinhoListarCommand();

		List<Produto> produtoCestasV = cmdListaCarrinho.call();

		produtoCestasV.add(produtoCestaV);

		return produtoCestaV;

	}

	public Produto getproduto() {
		return produtoCestaV;

	}

	public void setProduto(Produto produto) {

	}

	public Produto getprodutoCestaV() {
		return produtoCestaV;
	}

	public void setprodutoCestaV(Produto produtoCestaV) {
		this.produtoCestaV = produtoCestaV;
	}

}
