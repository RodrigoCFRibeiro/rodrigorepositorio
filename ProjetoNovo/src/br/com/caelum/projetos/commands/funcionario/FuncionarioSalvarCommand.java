package br.com.caelum.projetos.commands.funcionario;

import java.util.List;
import java.util.Scanner;

import br.com.caelum.projetos.commands.Command;
import br.com.caelum.projetos.modelo.Funcionario;

public class FuncionarioSalvarCommand implements Command<Funcionario> {

	private Funcionario funcionario;

	Scanner SC = new Scanner(System.in);

	public Funcionario call() {

		FuncionarioListarCommand cmdListaFuncionario = new FuncionarioListarCommand();

		List<Funcionario> funcionarios = cmdListaFuncionario.call();

		funcionarios.add(funcionario);

		return funcionario;

	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

}
