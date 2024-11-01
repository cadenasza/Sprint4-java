package br.com.fiap.beans;


public class Servico {

	private int serviço;
	private String descricao;
	private double valor;
	private String dataServico;
	private String dataValidade;

	public Servico() {
		super();
	}

	public Servico(int serviço, String descricao, double valor, String dataServico, String dataValidade) {
		super();
		this.serviço = serviço;
		this.descricao = descricao;
		this.valor = valor;
		this.dataServico = dataServico;
		this.dataValidade = dataValidade;
	}

	public int getServiço() {
		return serviço;
	}

	public void setServiço(int serviço) {
		this.serviço = serviço;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDataServico() {
		return dataServico;
	}

	public void setDataServico(String dataServico) {
		this.dataServico = dataServico;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

}
