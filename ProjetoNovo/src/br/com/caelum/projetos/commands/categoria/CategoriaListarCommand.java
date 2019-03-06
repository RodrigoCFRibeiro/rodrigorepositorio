package br.com.caelum.projetos.commands.categoria;

import java.util.List;

import br.com.caelum.projetos.commands.Command;
import br.com.caelum.projetos.main.Projeto;
import br.com.caelum.projetos.modelo.Categoria;

public class CategoriaListarCommand implements Command<List<Categoria>> {

	@Override
	public List<Categoria> call() {

		return Projeto.LISTA_CATEGORIA;
	}

}
