package br.com.fiap.beans;

public class CorVeiculo {

	private int idCor;
	private String cor;

	public CorVeiculo() {
		super();
	}

	public CorVeiculo(int idCor, String cor) {
		super();
		this.idCor = idCor;
		this.cor = cor;
	}

	public int getIdCor() {
		return idCor;
	}

	public void setIdCor(int idCor) {
		this.idCor = idCor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
