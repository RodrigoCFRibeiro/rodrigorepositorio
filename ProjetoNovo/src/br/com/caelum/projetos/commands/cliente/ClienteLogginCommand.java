package br.com.caelum.projetos.commands.cliente;

import java.util.List;

import br.com.caelum.projetos.commands.Command;
import br.com.caelum.projetos.modelo.Cliente;

public class ClienteLogginCommand implements Command<Cliente> {

	private Cliente clienteC;

	public Cliente call() {

		ClienteLogginListCommand cmdListaCliente = new ClienteLogginListCommand();

		List<Cliente> clientes = cmdListaCliente.call();

		clientes.add(clienteC);

		return clienteC;
	}

	public Cliente getClienteC() {
		return clienteC;
	}

	public void setClienteC(Cliente clienteC) {
		this.clienteC = clienteC;
	}

	public void setCliente(Cliente cliL) {
		// TODO Auto-generated method stub

	}

}