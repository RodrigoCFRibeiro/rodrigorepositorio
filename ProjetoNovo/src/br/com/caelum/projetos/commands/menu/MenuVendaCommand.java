package br.com.caelum.projetos.commands.menu;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import br.com.caelum.projetos.commands.Command;
import br.com.caelum.projetos.commands.cupom.CupomFiscalCommand;
import br.com.caelum.projetos.commands.produto.ProdutoListarCommand;
import br.com.caelum.projetos.commands.venda.VendaListarCommand;
import br.com.caelum.projetos.commands.venda.VendaSalvarCommand;
import br.com.caelum.projetos.modelo.Funcionario;
import br.com.caelum.projetos.modelo.Item;
import br.com.caelum.projetos.modelo.Produto;
import br.com.caelum.projetos.modelo.Venda;

public class MenuVendaCommand implements Command<Void> {
	Scanner SC = new Scanner(System.in);

	private static double valorTotal = 0;

	CupomFiscalCommand cmdcf = new CupomFiscalCommand();
	MenuClienteCommand cmdc = new MenuClienteCommand();

	VendaListarCommand listaVenda = new VendaListarCommand();

	List<Venda> vendas = listaVenda.call();

	ProdutoListarCommand listaProduto = new ProdutoListarCommand();

	List<Produto> produtos = listaProduto.call();

	Venda vendaProd = new Venda();

	public Void call() {
		CupomFiscalCommand cmdcf = new CupomFiscalCommand();
		MenuClienteCommand cmdc = new MenuClienteCommand();

		int op = 0;
		try {

			if (produtos.isEmpty()) {
				System.out.println("Sem Produtos Cadastrados!");
				op = (3);
			} else {

				System.out.println("  1  Comprar?  ");
				System.out.println("  2  Finalizar Compra?  ");
				System.out.println("  3  Voltar Menu CLiente");
				System.out.println("  4  Sair");

				op = SC.nextInt();
			}
		} catch (InputMismatchException e) {
			System.out.println("Erro: Nâo aceita letra apenas número. ");
		}

		if (op >= 1 || op <= 4) {

			switch (op) {

			case 1:

				// PRODUTO PARA ESCOLHA;

				System.out.println("Escolha seu Produto: ");
				int c = 0;
				for (Produto produto : produtos) {

					System.out.println("Nº: " + c + "   " + "Nome: " + produto.getNomeProduto() + "   " + "Qauntidade: "
							+ produto.getQuantidade() + "   " + "Preço: " + produto.getPreco() + "   " + "Descrição: "
							+ produto.getDescricao());

					c += 1;

				}

				// ESCOLHA O PRODUTO;
				try {
					int id = SC.nextInt();

					Item it = new Item();

					it.setProduto(produtos.get(id));

					System.out.println("Quantidade: ");
					double qte = SC.nextDouble();
					it.setQuantidade(qte);

					// ADICIONA DA LISTA ITEM;
					List<Item> itensVendidos = new ArrayList<Item>();
					itensVendidos.add(it);

					// ADICIONA EM VENDAPROD;

					vendaProd.setItens(itensVendidos);

					// efetuando a venda
					for (Item item : vendaProd.getItens()) {
						System.out.println("Produto: " + item.getProduto().getNomeProduto() + "   Valor: "
								+ item.getProduto().getPreco() + "  Quantidade: " + item.getProduto().getQuantidade());
						double totalItem = item.getQuantidade() * item.getProduto().getPreco();
						System.out.println("Valor Total do Item: " + totalItem);

						// valor total
						valorTotal += totalItem;

					}

				} catch (InputMismatchException e) {
					System.out.println("Erro: Nâo aceita letra apenas número. ");
				}
				VendaSalvarCommand cmdSalvaVenda = new VendaSalvarCommand();

				cmdSalvaVenda.setVenda(vendaProd);

				cmdSalvaVenda.call();

				vendaProd = new Venda();

				op = (0);

				break;

			case 2:

				// imprimindo

				cmdcf.call();

				op = (3);

				break;
			case 3: // voltar ao menu cliente;

				cmdc.call();

				break;

			case 4: // sair;

				System.exit(0);

				break;

			default:
				System.out.println("Erro: Digite a opção 1, 2, 3 ou 4");

			}
		}
	
		MenuVendaCommand venda = new MenuVendaCommand();
		venda.call();
		
		return null;
	}

	public Venda getVendaProd() {
		return vendaProd;
	}

	public void setVendaProd(Venda vendaProd) {
		this.vendaProd = vendaProd;
	}

	public double getValorTotal() {
		return valorTotal;
	}

}
