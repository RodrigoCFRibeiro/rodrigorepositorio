package br.com.caelum.projetos.main;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.projetos.modelo.Cliente;
import br.com.caelum.projetos.modelo.Item;
import br.com.caelum.projetos.modelo.Produto;
import br.com.caelum.projetos.modelo.Venda;

public class MainTudu {

	public static void main(String[] args) {
		Cliente cli = new Cliente();
		cli.setNomeCliente("Arthur");

		// cadastra produto
		Produto p1 = new Produto();
		p1.setNomeProduto("Bola");
		p1.setPreco(155.2);

		// cadastra produto
		Produto p2 = new Produto();
		p2.setNomeProduto("Tenis");
		p2.setPreco(15.2);

		// escolhendo item de produto
		Item item1 = new Item();
		item1.setProduto(p1);
		item1.setQuantidade(5);

		// escolhendo item de produto
		Item item2 = new Item();
		item2.setProduto(p2);
		item2.setQuantidade(1);

		// adicionando os item em lista
		List<Item> itensVendidos = new ArrayList<Item>();
		itensVendidos.add(item1);
		itensVendidos.add(item2);

		// lista de venda
		Venda vendaTutu = new Venda();
		// vendaTutu.setCliente(cli);
		vendaTutu.setItens(itensVendidos);

		// nome do cliente da venda
		System.out.println("Cliente: " + vendaTutu.getCliente().getNomeCliente());

		double valorTotal = 0;

		// efetuando a venda
		for (Item item : vendaTutu.getItens()) {
			System.out.println(
					"Produto: " + item.getProduto().getNomeProduto() + "---- Valor: " + item.getProduto().getPreco());
			double totalItem = item.getQuantidade() * item.getProduto().getPreco();
			System.out.println("Valor Total do Item: " + totalItem);

			// valor total
			valorTotal = valorTotal + totalItem;
		}

		// imprimindo
		System.out.println("Valor total da compra: " + valorTotal);

	}

}
