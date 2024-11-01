package br.com.fiap.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fiap.beans.Cliente;
import br.com.fiap.dao.ClienteDAO;

public class ClienteBO {
	
	ClienteDAO clienteDao;
	
	// Selecionar 
	public ArrayList<Cliente> selecionarBo() throws ClassNotFoundException, SQLException{
		clienteDao = new ClienteDAO();
		
		return (ArrayList<Cliente>) clienteDao.selecionar();
	}
	
	// Inserir 
	public void inserirBo(Cliente cliente) throws ClassNotFoundException, SQLException {
		ClienteDAO clienteDAO = new ClienteDAO();
		
		
		clienteDAO.inserir(cliente);
	}
	
	// Atualizar 
	public void atualizarBo(Cliente cliente) throws ClassNotFoundException, SQLException {
		ClienteDAO clienteDAO = new ClienteDAO();
		
		
		clienteDAO.atualizar(cliente);
	}
	
	
	// Deletar 
	public void deletarBo(int idCliente) throws ClassNotFoundException, SQLException {
		ClienteDAO clienteDAO = new ClienteDAO();
		
		
		clienteDAO.deletar(idCliente);
	}		

}
