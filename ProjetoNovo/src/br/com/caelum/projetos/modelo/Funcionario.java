package br.com.caelum.projetos.modelo;

public class Funcionario {

	private String Funcionario;
	private int idFuncionario;
	private double senhaFuncionario;

	public String getNomeFuncionario() {
		return Funcionario;
	}

	public void setNomeFuncionario(String Funcionario) {
		this.Funcionario = Funcionario;
	}

	public int getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public double getSenhaFuncionario() {
		return senhaFuncionario;
	}

	public void setSenhaFuncionario(double senhaFuncionario) {
		this.senhaFuncionario = senhaFuncionario;
	}

	public String toString() {
		return Funcionario + "   " + senhaFuncionario;
	}

	public void opcao() {
		// TODO Auto-generated method stub

	}

}