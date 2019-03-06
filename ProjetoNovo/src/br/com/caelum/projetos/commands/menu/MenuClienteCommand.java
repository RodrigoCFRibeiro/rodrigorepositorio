package br.com.caelum.projetos.commands.menu;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import br.com.caelum.projetos.commands.Command;
import br.com.caelum.projetos.commands.cliente.ClienteListarCommand;
import br.com.caelum.projetos.commands.cliente.ClienteSalvarCommand;
import br.com.caelum.projetos.modelo.Cliente;
import br.com.caelum.projetos.modelo.Produto;

public class MenuClienteCommand implements Command<Void> {

	Scanner SC = new Scanner(System.in);

	private static Cliente clienteLog = new Cliente();

	ClienteListarCommand listaCliente = new ClienteListarCommand();

	List<Cliente> clientes = listaCliente.call();

	public Cliente getClienteLog() {
		return clienteLog;
	}

	@SuppressWarnings("static-access")
	public void setClienteLog(Cliente clienteLog) {
		this.clienteLog = clienteLog;
	}

	@Override
	public Void call() {

		MenuPrincipalCommand cmdm = new MenuPrincipalCommand();
		MenuVendaCommand cmdv = new MenuVendaCommand();

		int op = 0;
		try {

			System.out.println("Menu do Cliente");
			System.out.println("  1 Cadastrar Cliente");
			System.out.println("  2 Acessar Cliente");
			System.out.println("  3 Voltar Menu Principal");
			System.out.println("  4 Sair Programa");

			op = SC.nextInt();

		} catch (InputMismatchException e) {
			System.out.println("Erro: Nâo aceita letra apenas número. ");

		}
		@SuppressWarnings("unused")
		Produto produto = null;

		if (op >= 1 || op <= 5) {

			switch (op) {

			case 0: // menu principal;

				break;
			case 1: // cadastra cliente;

				Cliente cliente = new Cliente();
				SC.nextLine();

				System.out.println("Digite o Nome");
				String nome = SC.nextLine();
				cliente.setNomeCliente(nome);

				System.out.println("Digite o Cpf");
				try {
					double cpf = SC.nextDouble();
					cliente.setCpfCliente(cpf);
				} catch (InputMismatchException e) {
					System.out.println("ERRO: CPF usar apenas números \n");

					MenuClienteCommand cpf = new MenuClienteCommand();
					cpf.call();

				}

				SC.nextLine();
				System.out.println("Digite o End");
				String end = SC.nextLine();
				cliente.setEndCliente(end);

				System.out.println("Digite a Idade");
				try {
					int idade = SC.nextInt();
					cliente.setIdadeCliente(idade);
				} catch (InputMismatchException e) {
					System.out.println("ERRO: Idade usar apenas números \n");
					MenuClienteCommand idade = new MenuClienteCommand();
					idade.call();
				}

				ClienteSalvarCommand cmdSalvaCliente = new ClienteSalvarCommand();
				cmdSalvaCliente.setCliente(cliente);
				cmdSalvaCliente.call();

				op = (0);

				break;

			case 2: // logar listar;

				Cliente cliL = new Cliente();
				SC.nextLine();

				System.out.println("Digite o Nome");
				String nomeC = SC.nextLine();
				cliL.setNomeCliente(nomeC);

				System.out.println("Digite o CPF");
				try {
					double cpfC = SC.nextDouble();
					cliL.setCpfCliente(cpfC);

					ClienteListarCommand cmdVerificaCliente = new ClienteListarCommand();
					cmdVerificaCliente.setCliente(cliL);
					cmdVerificaCliente.call();

					for (Cliente clienteL : clientes) {

						if (cpfC == clienteL.getCpfCliente()) {

							clienteLog.setNomeCliente(clienteL.getNomeCliente());
							clienteLog.setCpfCliente(clienteL.getCpfCliente());
							clienteLog.setEndCliente(clienteL.getEndCliente());
							clienteLog.setIdadeCliente(clienteL.getIdadeCliente());

							System.out.println("Cliente Logado" + clienteLog);

							cmdv.call();

						} else {

							System.out.println("Nao Logado");
							op = (0);
						}

					}

				} catch (InputMismatchException e) {

					System.out.println("ERRO: CPF usar apenas números \n");

					MenuClienteCommand cpf = new MenuClienteCommand();
					cpf.call();

				}

				break;

			case 3: // voltar ao menu principal;

				cmdm.call();

				break;

			case 4: // sair;

				System.exit(0);

				break;
			default:
				System.out.println("Erro: Digite a opção 1, 2, 3 ou 4");

			}
		}

		MenuClienteCommand SS = new MenuClienteCommand();
		SS.call();

		return null;
	}

}