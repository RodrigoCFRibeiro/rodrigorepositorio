package br.com.caelum.projetos.commands.cupom;

import java.util.List;

import br.com.caelum.projetos.commands.Command;
import br.com.caelum.projetos.commands.menu.MenuClienteCommand;
import br.com.caelum.projetos.commands.menu.MenuFuncionarioCommand;
import br.com.caelum.projetos.commands.menu.MenuVendaCommand;
import br.com.caelum.projetos.commands.venda.VendaListarCommand;
import br.com.caelum.projetos.modelo.Venda;

public class CupomFiscalCommand implements Command<Void> {

	VendaListarCommand listaVenda = new VendaListarCommand();

	List<Venda> vendas = listaVenda.call();

	private Void cupomFiscal;

	@Override
	public Void call() {

		MenuClienteCommand cmdc = new MenuClienteCommand();
		MenuFuncionarioCommand cmdf = new MenuFuncionarioCommand();
		MenuVendaCommand cmdv = new MenuVendaCommand();

		System.out.println("Fim da Compra");

		System.out.println("Cliente:  " + cmdc.getClienteLog());

		System.out.println("Funcionario:  " + cmdf.getFuncionarioLog());

		for (Venda venda : vendas) {

			System.out.println("Venda : " + venda);

		}

		System.out.println("Total  " + cmdv.getValorTotal());

		MenuClienteCommand fim = new MenuClienteCommand();
		fim.call();

		return cupomFiscal;

	}

}
