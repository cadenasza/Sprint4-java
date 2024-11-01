package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.dao.ClienteDAO;

public class TesteDeletarCliente {
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Instanciar objetos 
		Cliente objCliente = new Cliente();
		
		ClienteDAO dao = new ClienteDAO();
		
		objCliente.setIdCliente(inteiro("Digite o codigo do cliente a ser deletado"));
		
		System.out.println(dao.deletar(objCliente.getIdCliente()));

	}

}
