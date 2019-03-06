package br.com.caelum.projetos.modelo;

public class Cliente {

	private String nomeCliente;
	private double cpfCliente;
	private String endCliente;
	private int idadeCliente;
	private int idCliente;

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(double cpf) {
		this.cpfCliente = cpf;
	}

	public String getEndCliente() {
		return endCliente;
	}

	public void setEndCliente(String endCliente) {
		this.endCliente = endCliente;
	}

	public int getIdadeCliente() {
		return idadeCliente;
	}

	public void setIdadeCliente(int idadeCliente) {
		this.idadeCliente = idadeCliente;
	}

	public int getidCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String toString() {
		return String.format("   "  +  nomeCliente + "   " + cpfCliente + "   " + endCliente + "   " + idadeCliente);

	}

	public void setProduto(String item) {
		// TODO Auto-generated method stub

	}

	public void setQuantidade(String quantidadeI) {
		// TODO Auto-generated method stub

	}

	public void setCliente(Cliente cliL) {
		// TODO Auto-generated method stub

	}

	public void add(Cliente cl) {
		// TODO Auto-generated method stub

	}

	public static Cliente getclienteLog() {
		// TODO Auto-generated method stub
		return null;
	}

}
