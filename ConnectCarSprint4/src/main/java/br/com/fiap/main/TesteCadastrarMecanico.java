package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Mecanico;
import br.com.fiap.dao.MecanicoDAO;

public class TesteCadastrarMecanico {
	
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
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Mecanico objMecanico = new Mecanico();
		MecanicoDAO dao = new MecanicoDAO();
		objMecanico.setNome(texto("Insira o nome do Mecanico: "));
		objMecanico.setEmail(texto("Insira o email do Mecanico: "));
		objMecanico.setCpf(texto("Insira o cpf do Mecanico: "));
		objMecanico.setSenha(texto("Insira a senha do Mecanico: "));
		objMecanico.setRg(texto("Insira o Rg do Mecanico: "));
		objMecanico.setTelefone(texto("Insira o telefone do Mecanico: "));
		objMecanico.setDataNascimento(texto("Insira a data de nascimento do Mecanico: "));
		objMecanico.setIdMecanico(inteiro("Insira o codigo do Mecanico: "));
		
		System.out.println(dao.inserir(objMecanico));
	}

}
