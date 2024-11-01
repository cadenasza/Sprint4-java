package br.com.fiap.beans;

public class Mecanico {
	
	private String nome;
	private String email;
	private String senha;
	private String rg;
	private String cpf;
	private String telefone;
	private String dataNascimento;
	private int idMecanico;
	
	public Mecanico() {
		super();
	}
	

	public Mecanico(String nome, String email, String senha, String rg, String cpf, String telefone,
			String dataNascimento, int idMecanico) {
		super();
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.rg = rg;
		this.cpf = cpf;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
		this.idMecanico = idMecanico;
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
		this.email = email;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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

	public int getIdMecanico() {
		return idMecanico;
	}

	public void setIdMecanico(int idMecanico) {
		this.idMecanico = idMecanico;
	}
	
	
	

}
