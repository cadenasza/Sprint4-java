package br.com.fiap.beans;

public class Veiculo {

	private int idVeiculo;
	private String placa;
	private String chassi;

	public Veiculo() {
		super();
	}

	public Veiculo(int idVeiculo, String placa, String chassi) {
		super();
		this.idVeiculo = idVeiculo;
		this.placa = placa;
		this.chassi = chassi;
	}

	public int getIdVeiculo() {
		return idVeiculo;
	}

	public void setIdVeiculo(int idVeiculo) {
		this.idVeiculo = idVeiculo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

}
