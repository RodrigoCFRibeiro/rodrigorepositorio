package br.com.caelum.projetos.commands.produto;

import java.util.List;

import br.com.caelum.projetos.commands.Command;
import br.com.caelum.projetos.main.Projeto;
import br.com.caelum.projetos.modelo.Produto;

public class ProdutoListarCommand implements Command<List<Produto>> {

	public List<Produto> call() {

		return Projeto.LISTA_PRODUTO;
	}

	public void setIdProduto(String id) {
		// TODO Auto-generated method stub

	}

}
