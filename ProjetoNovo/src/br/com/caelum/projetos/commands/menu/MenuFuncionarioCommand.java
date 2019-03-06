package br.com.caelum.projetos.commands.menu;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import br.com.caelum.projetos.commands.Command;
import br.com.caelum.projetos.commands.categoria.CategoriaSalvarCommand;
import br.com.caelum.projetos.commands.funcionario.FuncionarioListarCommand;
import br.com.caelum.projetos.commands.funcionario.FuncionarioSalvarCommand;
import br.com.caelum.projetos.commands.produto.ProdutoSalvarCommand;
import br.com.caelum.projetos.modelo.Categoria;
import br.com.caelum.projetos.modelo.Cliente;
import br.com.caelum.projetos.modelo.Funcionario;
import br.com.caelum.projetos.modelo.Produto;;

public class MenuFuncionarioCommand implements Command<Void> {

	Scanner SC = new Scanner(System.in);
	private static Funcionario funcionarioLog = new Funcionario();

	public Void call() {

		MenuPrincipalCommand cmdm = new MenuPrincipalCommand();

		int op = 0;
		try {

			System.out.println("Menu do Funcionario");
			System.out.println("  1 Cadastrar Funcionario");
			System.out.println("  2 Acessar Funcionario");
			System.out.println("  3 Cadastrar Categoria");
			System.out.println("  4 Cadastrar Produto");
			System.out.println("  5 Voltar Menu Principal");
			System.out.println("  6 Sair Programa");

			op = SC.nextInt();

		} catch (InputMismatchException e) {
			System.out.println("Erro: Nâo aceita letra apenas número. ");

		}

		if (op >= 1 || op <= 6) {

			switch (op) {

			case 1: // cadastra funcionaio;

				Funcionario funcionario = new Funcionario();
				SC.nextLine();

				// dados;
				System.out.println("Digite o Nome");
				String nome = SC.nextLine();
				funcionario.setNomeFuncionario(nome);

				System.out.println("Digite a Senha");
				try {
					double senha = SC.nextDouble();
					funcionario.setSenhaFuncionario(senha);
				} catch (InputMismatchException e) {
					System.out.println("ERRO: Senha usar apenas números \n");
				}

				// salvando;
				FuncionarioSalvarCommand cmdSalvaFuncionario = new FuncionarioSalvarCommand();
				cmdSalvaFuncionario.setFuncionario(funcionario);
				cmdSalvaFuncionario.call();

				op = (0);

				break;

			case 2: // logar funcionario;;

				FuncionarioListarCommand listaFuncionario = new FuncionarioListarCommand();

				List<Funcionario> funcionarios = listaFuncionario.call();

				Funcionario funL = new Funcionario();

				SC.nextLine();

				System.out.println("Digite o Nome");
				String nomeF = SC.nextLine();
				funL.setNomeFuncionario(nomeF);

				System.out.println("Digite o Senha");
				try {
					double senhaF = SC.nextDouble();
					funL.setSenhaFuncionario(senhaF);

					FuncionarioListarCommand cmdVerificaFuncionario = new FuncionarioListarCommand();

					cmdVerificaFuncionario.setFuncionario(funL);

					for (Funcionario funcionarioL : funcionarios) {

						if (senhaF == funcionarioL.getSenhaFuncionario()) {

							funcionarioLog.setNomeFuncionario(funcionarioL.getNomeFuncionario());
							funcionarioLog.setSenhaFuncionario(funcionarioL.getSenhaFuncionario());

							System.out.println("Funcionario Logado  " + funcionarioLog);

							// op = (3);

						} else {

							System.out.println("Nao Logado");

						}

					}
				} catch (InputMismatchException e) {
					System.out.println("ERRO: Senha usar apenas números \n");

				}

				op = (0);

				break;

			case 3: // cadastra categoria;

				Categoria categoria = new Categoria();
				SC.nextLine();

				System.out.println("Digite a Categoria");
				String categoriaC = SC.nextLine();
				categoria.setNomeCategoria(categoriaC);

				CategoriaSalvarCommand cmdSalvaCategoria = new CategoriaSalvarCommand();
				cmdSalvaCategoria.setCategoria(categoria);
				cmdSalvaCategoria.call();

				System.out.println(categoria);

				op = (0);

				break;

			case 4: // cadastra produto;

				Produto produto = new Produto();
				SC.nextLine();

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

				op = (0);

				break;
			case 5: // volta ao menu principal;

				cmdm.call();

				break;
			case 6: // Sair;

				System.exit(0);

				break;

			default:

				System.out.println("Erro: Digite a opção 1, 2, 3, 4, 5 ou 6 ");

			}
		}
		MenuFuncionarioCommand SS = new MenuFuncionarioCommand();
		SS.call();

		return null;

	}

	public Funcionario getFuncionarioLog() {
		// TODO Auto-generated method stub
		return funcionarioLog;
	}

}
