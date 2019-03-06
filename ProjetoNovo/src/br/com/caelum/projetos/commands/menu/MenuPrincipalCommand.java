package br.com.caelum.projetos.commands.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.sun.corba.se.spi.orbutil.fsm.Input;

import br.com.caelum.projetos.commands.Command;

public class MenuPrincipalCommand implements Command<Void> {

	Scanner SC = new Scanner(System.in);

	public Void call() {

		MenuFuncionarioCommand cmdf = new MenuFuncionarioCommand();
		MenuClienteCommand cmdc = new MenuClienteCommand();

		int op = 0;

		try {

			System.out.println("Menu Principal");
			System.out.println("  1 Funcionario");
			System.out.println("  2 Cliente");
			System.out.println("  3 Sair Programa");

			op = SC.nextInt();

		}

		catch (InputMismatchException e) {
			System.out.println("Erro: Nâo aceita letra apenas número. ");

		}

		if (op >= 1 || op <= 3) {

			switch (op) {

			case 1: // menu funcionario;

				cmdf.call();

				op = (0);

				break;
			case 2: // menu cliente;

				cmdc.call();

				op = (0);

				break;
			case 3:// Sair;

				System.exit(0);

			default:

				System.out.println("Erro: Digite a opção 1, 2 ou 3 ");

			}
		}

		MenuPrincipalCommand SS = new MenuPrincipalCommand();
		SS.call();

		return null;
	}

}
