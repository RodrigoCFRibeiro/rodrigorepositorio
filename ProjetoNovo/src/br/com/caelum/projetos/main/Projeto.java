package br.com.caelum.projetos.main;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.projetos.commands.menu.MenuPrincipalCommand;
import br.com.caelum.projetos.modelo.CarrinhoCompra;
import br.com.caelum.projetos.modelo.Categoria;
import br.com.caelum.projetos.modelo.Cliente;
import br.com.caelum.projetos.modelo.Funcionario;
import br.com.caelum.projetos.modelo.Item;
import br.com.caelum.projetos.modelo.Produto;
import br.com.caelum.projetos.modelo.ProdutoVendido;
import br.com.caelum.projetos.modelo.Venda;

public class Projeto {

	public static List<Categoria> LISTA_CATEGORIA = new ArrayList<Categoria>();
	public static List<Funcionario> LISTA_FUNCIONARIO = new ArrayList<Funcionario>();
	public static List<Cliente> LISTA_CLIENTES = new ArrayList<Cliente>();
	public static List<CarrinhoCompra> LISTA_CARRINHOCOMPRA = new ArrayList<CarrinhoCompra>();
	public static List<Produto> LISTA_PRODUTO = new ArrayList<Produto>();
	public static List<Item> LISTA_ITEM = new ArrayList<Item>();
	public static List<ProdutoVendido> LISTA_PRODUTOVENDIDO = new ArrayList<ProdutoVendido>();
	public static List<Venda> LISTA_VENDA = new ArrayList<Venda>();

	public static void main(String[] args) {

		MenuPrincipalCommand cmd = new MenuPrincipalCommand();

		cmd.call();
	}

}