package br.com.caelum.projetos.commands.funcionario;

import java.util.List;

import br.com.caelum.projetos.commands.Command;
import br.com.caelum.projetos.main.Projeto;
import br.com.caelum.projetos.modelo.Cliente;
import br.com.caelum.projetos.modelo.Funcionario;

public class FuncionarioListarCommand implements Command<List<Funcionario>> {

	private Funcionario funcionario;

	public List<Funcionario> call() {

		return Projeto.LISTA_FUNCIONARIO;

	}

	public void setCliente(Cliente clienteL) {

	}

	public void setFuncionario(Funcionario funcionarioL) {
	}

	public Funcionario getFuncionario() {

		return funcionario;
	}

}
