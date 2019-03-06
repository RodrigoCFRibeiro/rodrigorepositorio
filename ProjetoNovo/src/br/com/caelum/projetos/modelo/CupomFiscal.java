package br.com.caelum.projetos.modelo;

public class CupomFiscal {

	private String produto;
	private String cliente;
	private double valorTotal;

	public boolean autenticaCliente(String cliente) {
		if (this.cliente == cliente) {
			System.out.println("nomeCliente");
			return true;
		} else {

			return false;
		}

	}

	public boolean autenticaProduto(String produto) {
		if (this.produto == produto) {
			System.out.println("nomeProduto");
			return true;
		} else {
			return false;

		}
	}

	public boolean autenticaValorTotal(double valorTotal) {
		if (this.valorTotal == valorTotal) {
			System.out.println("valorTotal");
			return true;
		} else {

			return false;
		}

	}

}
