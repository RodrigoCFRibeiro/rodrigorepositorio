package br.com.caelum.projetos.commands.cliente;

import java.util.List;

import br.com.caelum.projetos.commands.Command;
import br.com.caelum.projetos.main.Projeto;
import br.com.caelum.projetos.modelo.Cliente;

public class ClienteListarCommand implements Command<List<Cliente>> {

	public List<Cliente> call() {

		return Projeto.LISTA_CLIENTES;

	}

	public void setCliente(Cliente cliL) {

	}

	public String getNomeCliente() {
		return null;
	}

}
