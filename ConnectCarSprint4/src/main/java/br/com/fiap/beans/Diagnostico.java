package br.com.fiap.beans;

public class Diagnostico {

	private int idDiagnostico;
	private String data;
	private String hora;
	private String devolutiva;
	private String detalhes;

	public Diagnostico() {
		super();
	}

	public Diagnostico(int idDiagnostico, String localDate, String hora, String devolutiva, String detalhes) {
		super();
		this.idDiagnostico = idDiagnostico;
		this.data = localDate;
		this.hora = hora;
		this.devolutiva = devolutiva;
		this.detalhes = detalhes;
	}

	public int getIdDiagnostico() {
		return idDiagnostico;
	}

	public void setIdDiagnostico(int idDiagnostico) {
		this.idDiagnostico = idDiagnostico;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getDevolutiva() {
		return devolutiva;
	}

	public void setDevolutiva(String devolutiva) {
		this.devolutiva = devolutiva;
	}

	public String getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}

}
