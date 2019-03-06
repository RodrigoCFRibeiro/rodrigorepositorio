package br.com.caelum.projetos.commands.venda;

import java.util.List;

import br.com.caelum.projetos.commands.Command;
import br.com.caelum.projetos.main.Projeto;
import br.com.caelum.projetos.modelo.Venda;

public class VendaListarCommand implements Command<List<Venda>> {

	public List<Venda> call() {

		return Projeto.LISTA_VENDA;
	}

	public void setIdProduto(String id) {
		// TODO Auto-generated method stub

	}

}
