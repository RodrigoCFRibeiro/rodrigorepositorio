package br.com.caelum.projetos.commands.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.caelum.projetos.commands.Command;
import br.com.caelum.projetos.commands.produto.ProdutoSalvarCommand;
import br.com.caelum.projetos.modelo.Produto;

public class MenuProdutoCommand implements Command<Void> {

	Scanner SC = new Scanner(System.in);

	public Void call() {

		Produto produto = new Produto();

		System.out.println("Cadastra Produto");
		System.out.println("Id do Poduto");
		try {
			int idP = SC.nextInt();
			produto.setIdProduto(idP);
		} catch (InputMismatchException e) {
			System.out.println("Erro: Id usar apenas números");
			MenuFuncionarioCommand id = new MenuFuncionarioCommand();
			id.call();
		}
		SC.nextLine();
		System.out.println("Digite o Poduto");
		String nomeP = SC.nextLine();
		produto.setNomeProduto(nomeP);

		System.out.println("Digite o Preço");
		try {
			double preco = SC.nextDouble();
			produto.setPreco(preco);
		} catch (InputMismatchException e) {
			System.out.println("Erro: Preço usar apenas números");
			MenuFuncionarioCommand preco = new MenuFuncionarioCommand();
			preco.call();
		}
		SC.nextLine();
		System.out.println("Digite a Descrição");
		String descricao = SC.nextLine();
		produto.setDescricao(descricao);

		System.out.println("Digite a Quantidade");
		try {
			double quantidade = SC.nextDouble();
			produto.setQuantidade(quantidade);
		} catch (InputMismatchException e) {
			System.out.println("Erro: Quantidade usar apenas números");
			MenuFuncionarioCommand qtd = new MenuFuncionarioCommand();
			qtd.call();
		}
		ProdutoSalvarCommand cmdSalvaProduto = new ProdutoSalvarCommand();

		cmdSalvaProduto.setProduto(produto);
		cmdSalvaProduto.call();

		System.out.println(produto);

		MenuFuncionarioCommand prod = new MenuFuncionarioCommand();
		prod.call();

		return null;
	}
}
