package br.com.fiap.main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Cliente;
import br.com.fiap.dao.ClienteDAO;

public class TesteSelecionarCliente {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Instanciar objetos 
		ClienteDAO dao = new ClienteDAO();
		
		List<Cliente> listaCliente = (ArrayList<Cliente>) dao.selecionar();
		
		if(listaCliente != null) {
			// foreach 
			for( Cliente cliente : listaCliente) {
				System.out.println(cliente.getIdCliente() + " " + 
									cliente.getNome() + " " + 
						        	cliente.getEmail() + " " + 
									cliente.getCnh() + " " +
									cliente.getSenha() + " " +
									cliente.getRg() + " " +
									cliente.getTelefone() + " " +
									cliente.getDataNascimento() + " ");
			}
		}

	}

}
