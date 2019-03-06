package br.com.caelum.projetos.commands.item;

import java.util.List;

import br.com.caelum.projetos.commands.Command;
import br.com.caelum.projetos.main.Projeto;
import br.com.caelum.projetos.modelo.Item;

public class ItemListarCommand implements Command<List<Item>> {

	@Override
	public List<Item> call() {

		return Projeto.LISTA_ITEM;

	}
	
}
