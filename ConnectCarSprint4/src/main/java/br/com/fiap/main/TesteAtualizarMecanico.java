package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Mecanico;
import br.com.fiap.dao.MecanicoDAO;

public class TesteAtualizarMecanico {
	
	static String texto (String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real (String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Instanciar objetos
		Mecanico objMecanico = new Mecanico();
		
		MecanicoDAO dao = new MecanicoDAO();
		
		objMecanico.setIdMecanico(inteiro("Insira o codigo a ser alterado"));
		objMecanico.setNome(texto("Nome"));
		objMecanico.setEmail(texto("Email"));
		objMecanico.setCpf(texto("Cpf"));
		objMecanico.setSenha(texto("Senha"));
		objMecanico.setRg(texto("Rg"));
		objMecanico.setTelefone(texto("Telefone"));
		objMecanico.setDataNascimento(texto("Data nascimento"));
		System.out.println(dao.atualizar(objMecanico));

	}
	

}
