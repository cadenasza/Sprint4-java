package br.com.fiap.beans;

public class ModeloVeiculo {

	private int idModelo;
	private String modelo;

	public ModeloVeiculo() {
		super();
	}

	public ModeloVeiculo(int idModelo, String modelo) {
		super();
		this.idModelo = idModelo;
		this.modelo = modelo;
	}

	public int getIdModelo() {
		return idModelo;
	}

	public void setIdModelo(int idModelo) {
		this.idModelo = idModelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
