package br.com.caelum.projetos.commands.venda;

import java.util.List;

import br.com.caelum.projetos.commands.Command;
import br.com.caelum.projetos.modelo.Venda;

public class VendaSalvarCommand implements Command<Venda> {

	private Venda venda;

	public Venda call() {

		VendaListarCommand cmdListaVenda = new VendaListarCommand();

		cmdListaVenda.call().add(venda);

		return null;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda vendaProd) {
		this.venda = vendaProd;

	}

}
