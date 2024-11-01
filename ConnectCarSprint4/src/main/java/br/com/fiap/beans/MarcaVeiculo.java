package br.com.fiap.beans;

public class MarcaVeiculo {

	private int idMarca;
	private String Marca;
	private String ano;

	public MarcaVeiculo() {
		super();
	}

	public MarcaVeiculo(int idMarca, String marca, String ano) {
		super();
		this.idMarca = idMarca;
		Marca = marca;
		this.ano = ano;
	}

	public int getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(int idMarca) {
		this.idMarca = idMarca;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

}
