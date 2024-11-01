package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.dao.ClienteDAO;

public class TesteAtualizarCliente {
	
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
		Cliente objCliente = new Cliente();
		
		ClienteDAO dao = new ClienteDAO();
		
		objCliente.setIdCliente(inteiro("Insira o codigo a ser alterado"));
		objCliente.setNome(texto("Nome"));
		objCliente.setEmail(texto("Email"));
		objCliente.setCnh(texto("Cnh"));
		objCliente.setSenha(texto("Senha"));
		objCliente.setRg(texto("Rg"));
		objCliente.setTelefone(texto("Telefone"));
		objCliente.setDataNascimento(texto("Data nascimento"));
		System.out.println(dao.atualizar(objCliente));

	}
	

}
