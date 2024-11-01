package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.dao.ClienteDAO;

public class TesteCadastrarCliente {
	
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
		
		Cliente objCliente = new Cliente();
		ClienteDAO dao = new ClienteDAO();
		objCliente.setNome(texto("Insira o nome do cliente: "));
		objCliente.setEmail(texto("Insira o email do cliente: "));
		objCliente.setCnh(texto("Insira a cnh do cliente: "));
		objCliente.setSenha(texto("Insira a senha do cliente: "));
		objCliente.setRg(texto("Insira o Rg do cliente: "));
		objCliente.setTelefone(texto("Insira o telefone do cliente: "));
		objCliente.setDataNascimento(texto("Insira a data de nascimento do cliente: "));
		objCliente.setIdCliente(inteiro("Insira o codigo do cliente: "));
		
		System.out.println(dao.inserir(objCliente));
	}

}
