package br.com.caelum.projetos.commands.cliente;

import java.util.List;

import br.com.caelum.projetos.commands.Command;
import br.com.caelum.projetos.modelo.Cliente;

public class ClienteSalvarCommand implements Command<Cliente> {

	private Cliente cliente;

	public Cliente call() {

		ClienteListarCommand cmdListaCliente = new ClienteListarCommand();

		List<Cliente> clientes = cmdListaCliente.call();

		clientes.add(cliente);

		return cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
