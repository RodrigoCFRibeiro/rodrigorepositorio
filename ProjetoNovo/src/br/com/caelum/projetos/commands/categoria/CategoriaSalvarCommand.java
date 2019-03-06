package br.com.caelum.projetos.commands.categoria;

import java.util.List;


import br.com.caelum.projetos.commands.Command;
import br.com.caelum.projetos.modelo.Categoria;

public class CategoriaSalvarCommand implements Command<Categoria> {

	private Categoria categoria;


	@Override
	public Categoria call() {

		CategoriaListarCommand cmdListaCategoria = new CategoriaListarCommand();

		List<Categoria> categorias = cmdListaCategoria.call();

		categorias.add(categoria);

		for (Categoria categoriaCt : categorias) {
			System.out.println("Nome: " + categoriaCt.getNomeCategoria());
		}

		return categoria;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
