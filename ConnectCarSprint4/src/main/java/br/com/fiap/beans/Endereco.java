package br.com.fiap.beans;

public class Endereco {
	
	private String estado;
	private String cep;
	private String logradouro;
	private String cidade;
	private String bairro;
	private int numero;
	
	public Endereco() {
		super();
	}

	
	public Endereco(String estado, String cep, String logradouro, String cidade, String bairro, int numero) {
		super();
		this.estado = estado;
		this.cep = cep;
		this.logradouro = logradouro;
		this.cidade = cidade;
		this.bairro = bairro;
		this.numero = numero;
	}



	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	

}
