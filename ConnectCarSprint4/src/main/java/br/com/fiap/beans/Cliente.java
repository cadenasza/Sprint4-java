package br.com.fiap.beans;

public class Cliente {

	private String nome;
	private String email;
	private String cnh;
	private String senha;
	private String rg;
	private String telefone;
	private String dataNascimento;
	private int idCliente;
	private Endereco endereco;
	
	
	public Cliente() {
		super();
	}



	public Cliente(String nome, String email, String cnh, String senha, String rg, String telefone,
			String dataNascimento, int idCliente) {
		super();
		this.nome = nome;
		this.email = email;
		this.cnh = cnh;
		this.senha = senha;
		this.rg = rg;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
		this.idCliente = idCliente;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email.toLowerCase();
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}


	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
	
	
	
}
