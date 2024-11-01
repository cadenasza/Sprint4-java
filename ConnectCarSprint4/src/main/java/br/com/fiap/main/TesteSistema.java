package br.com.fiap.main;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.CorVeiculo;
import br.com.fiap.beans.Diagnostico;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.MarcaVeiculo;
import br.com.fiap.beans.Mecanico;
import br.com.fiap.beans.ModeloVeiculo;
import br.com.fiap.beans.Oficina;
import br.com.fiap.beans.Servico;
import br.com.fiap.beans.Veiculo;

public class TesteSistema {

	// String
	public static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}

	// Double
	public static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	// Integer
	public static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));

	}

	public static void main(String[] args) {
		
		ArrayList<Mecanico> listaMecanico = new ArrayList<Mecanico>();

		Mecanico objMecanico = null;
		
		/*
		 * String nome, String email, String cnh, String senha, String rg, String cpf,
		 * String telefone, String dataNascimento, int idCliente
		 */
		Cliente objCliente = new Cliente(texto("Nome do cliente: "), texto("Email do cliente:"), texto("CNH: "),
				texto("Senha: "), texto("RG: "), texto("Telefone: "), texto("Data de nascimento: "),
				inteiro("Código do cliente: "));

		/*
		 * String estado, String cep, String logradouro, String cidade, String bairro,
		 * int numero
		 */
		Endereco objEndCliente = new Endereco(texto("Estado do cliente: "), texto("CEP do cliente: "),
				texto("Logradouro do cliente: "), texto("Cidade do cliente: "), texto("Bairro do cliente: "),
				inteiro("Número do cliente: "));

		// int idDiagnostico, Date data, LocalTime hora, String devolutiva, String
		// detalhes
		Diagnostico objDiagnostico = new Diagnostico(inteiro("Código do diagnóstico:"), texto("Data do diagnóstico: "),
				texto("Hora do diagnóstico: "), texto("Devolutiva: "), texto("Detalhes: "));

		/*
		 * String nome, String email, String senha, String rg, String cpf, String
		 * telefone, String dataNascimento, int idMecanico
		 */
		do {
			objMecanico = new Mecanico();
			objMecanico.setNome(texto("Nome do mecanico"));
			objMecanico.setEmail(texto("Email do mecanico"));
			objMecanico.setSenha(texto("Senha do mecanico"));
			objMecanico.setRg(texto("Rg do mecanico"));
			objMecanico.setCpf(texto("Cpf do mecanico"));
			objMecanico.setTelefone(texto("Telefone do mecanico"));
			objMecanico.setDataNascimento(texto("Data de nascimento do mecanico"));
			objMecanico.setIdMecanico(inteiro("codigo do mecanico"));
			listaMecanico.add(objMecanico);
		} while (JOptionPane.showConfirmDialog(null, "Cadastrar outro mecanico?",
				"Cadastro de mecanicos",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE) == 0);
		
		
		
		// int idOficina, String nome, String logo, String cnpj, String telefone
		Oficina objOficina = new Oficina(inteiro("Código da oficina: "), texto("Nome da oficina: "),
				texto("Logo da oficina: "), texto("CNPJ da oficina: "), texto("Telefone da oficina: "));

		Endereco objEndOficina = new Endereco(texto("Estado da oficina: "), texto("CEP da oficina: "),
				texto("Logradouro da oficina: "), texto("Cidade da oficina: "), texto("Bairro da oficina: "),
				inteiro("Número da oficina: "));

		// int serviço, String descricao, double valor, Date dataServico, Date
		// dataValidade
		Servico objServico = new Servico(inteiro("Código do serviço: "), texto("Descrição: "), real("Valor: "),
				texto("Data: "), texto("Data de validade: "));

		// int idVeiculo, String placa, String chassi
		Veiculo objVeiculo = new Veiculo(inteiro("Código do veículo: "), texto("Placa: "), texto("Chassi: "));

		// int idCor, String cor
		CorVeiculo objCorVeiculo = new CorVeiculo(inteiro("Código da cor do veículo: "), texto("Cor do veículo: "));

		// int idModelo, String modelo
		ModeloVeiculo objModVeiculo = new ModeloVeiculo(inteiro("Código do modelo do veículo: "),
				texto("Modelo do veículo: "));

		// int idMarca, String marca, LocalDate ano
		MarcaVeiculo objMarcaVeiculo = new MarcaVeiculo(inteiro("Código da marca: "), texto("Marca do veículo: "),

				texto("Ano do veículo: "));

		// atributo de referencia
		objCliente.setEndereco(objEndCliente);
		objOficina.setEndereco(objEndOficina);

		System.out.println("Informações sobre o Cliente: " + "\nNome: " + objCliente.getNome() + "\nEmail: "
				+ objCliente.getEmail() + "\nCNH: " + objCliente.getCnh() + "\nSenha: " + objCliente.getSenha()
				+ "\nRG: " + objCliente.getRg() + "\nCPF: " + "\nTelefone: "
				+ objCliente.getTelefone() + "\nData de nascimento: " + objCliente.getDataNascimento()
				+ "\nCódigo do cliente: " + objCliente.getIdCliente() +

				"\nENDEREÇO DO CLIENTE: " + "\nEstado: " + objCliente.getEndereco().getEstado() + "\nCEP: "
				+ objCliente.getEndereco().getEstado() + "\nLogradouro: " + objCliente.getEndereco().getLogradouro()
				+ "\nCidade: " + objCliente.getEndereco().getCidade() + "\nBairro: "
				+ objCliente.getEndereco().getBairro() + "\nNúmero: " + objCliente.getEndereco().getNumero() +

				"\n\nINFORMAÇÕES DO DIAGNÓSTICO: " + "\nCódigo do diagnóstico: " + objDiagnostico.getIdDiagnostico()
				+ "\nData: " + objDiagnostico.getData() + "\nHora: " + objDiagnostico.getHora() + "\nDevolutiva: "
				+ objDiagnostico.getDevolutiva() + "\nDetalhes: " + objDiagnostico.getDetalhes() +

				"\n\nINFORMAÇÕES DA OFICINA: " + "\nCódigo da oficina: " + objOficina.getIdOficina() + "\nNome: "
				+ objOficina.getNome() + "\nLogo: " + objOficina.getLogo() + "\nCNPJ: " + objOficina.getCnpj()
				+ "\nTelefone: " + objOficina.getTelefone() +

				"\nENDEREÇO DA OFICINA: " + "\nEstado: " + objOficina.getEndereco().getEstado() + "\nCEP: "
				+ objOficina.getEndereco().getCep() + "\nLogradouro: " + objOficina.getEndereco().getLogradouro()
				+ "\nCidade: " + objOficina.getEndereco().getCidade() + "\nBairro: "
				+ objOficina.getEndereco().getBairro() + "\nNúmero: " + objOficina.getEndereco().getNumero() +

				"\n\nSERVIÇO: " + "\nDescrição: " + objServico.getDescricao() + "\nCódigo do serviço: "
				+ objServico.getServiço() + "\nValor: " + objServico.getValor() + "\nData: "
				+ objServico.getDataServico() + "\nData de validade: " + objServico.getDataValidade() +

				"\n\nVEÍCULO: " + "\nCódigo: " + objVeiculo.getIdVeiculo() + "\nPlaca: " + objVeiculo.getPlaca()
				+ "\nChassi: " + objVeiculo.getChassi() +

				"\nCOR DO VEÍCULO: " + "\nCódigo da cor: " + objCorVeiculo.getIdCor() + "\nCor: "
				+ objCorVeiculo.getCor() +

				"\nMODELO DO CARRO: " + "\nCódigo do modelo: " + objModVeiculo.getIdModelo() + "\nModelo: "
				+ objModVeiculo.getModelo() +

				"\nMARCA DO CARRO: " + "\nCódigo: " + objMarcaVeiculo.getIdMarca() + "\nMarca: "
				+ objMarcaVeiculo.getMarca() + "\nAno: " + objMarcaVeiculo.getAno());
			
			for (Mecanico mecanico: listaMecanico) {
				System.out.println("\nInformacoes sobre mecanico" + 
						"\nNome: " + mecanico.getNome() + 
						"\nEmail: " + mecanico.getEmail() + 
						"\nSenha: " + mecanico.getSenha() + 
						"\nRG: " + mecanico.getRg() + 
						"\nCPF: " + mecanico.getCpf() + 
						"\nTelefone: " + mecanico.getTelefone()  +
						"\nData de nascimento: " + mecanico.getDataNascimento() + 
						"\nCodigo do mecanico: " + mecanico.getIdMecanico());
			}
	}

}
