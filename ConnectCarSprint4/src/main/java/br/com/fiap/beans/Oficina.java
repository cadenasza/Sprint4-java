package br.com.fiap.beans;

public class Oficina {

	private int idOficina;
	private String nome;
	private String logo;
	private String cnpj;
	private String telefone;
	private Endereco endereco;

	public Oficina() {
		super();
	}

	public Oficina(int idOficina, String nome, String logo, String cnpj, String telefone) {
		super();
		this.idOficina = idOficina;
		this.nome = nome;
		this.logo = logo;
		this.cnpj = cnpj;
		this.telefone = telefone;
	}

	public int getIdOficina() {
		return idOficina;
	}

	public void setIdOficina(int idOficina) {
		this.idOficina = idOficina;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
