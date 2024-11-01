package br.com.fiap.model;

public class Endereco{
	private String cep;
	private String logradouro;
	private String localidade;
	private String bairro;
	private String estado;
	private String regiao;
	
	
	public Endereco() {
		super();
	}
	
	
	public Endereco(String cep, String logradouro, String localidade, String bairro, String estado, String regiao) {
		super();
		this.cep = cep;
		this.logradouro = logradouro;
		this.localidade = localidade;
		this.bairro = bairro;
		this.estado = estado;
		this.regiao = regiao;
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
	public String getLocalidade() {
		return localidade;
	}
	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}


	@Override
	public String toString() {
		return "Endereco \ncep = " + cep + "\nlogradouro = " + logradouro + "\nlocalidade = " + localidade + "\nbairro = "
				+ bairro + "\nestado = " + estado + "\nregiao = " + regiao;
	}
	
	
}