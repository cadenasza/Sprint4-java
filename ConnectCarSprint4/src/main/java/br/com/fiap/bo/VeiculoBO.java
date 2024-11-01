package br.com.fiap.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fiap.beans.Veiculo;
import br.com.fiap.dao.VeiculoDAO;

public class VeiculoBO {
	
	VeiculoDAO veiculoDao;
	
	// Selecionar 
	public ArrayList<Veiculo> selecionarBo() throws ClassNotFoundException, SQLException{
		veiculoDao = new VeiculoDAO();
		
		return (ArrayList<Veiculo>) veiculoDao.selecionar();
	}
	
	// Inserir 
	public void inserirBo(Veiculo veiculo) throws ClassNotFoundException, SQLException {
		VeiculoDAO veiculoDAO = new VeiculoDAO();
		
		
		veiculoDAO.inserir(veiculo);
	}
	
	// Atualizar 
	public void atualizarBo(Veiculo veiculo) throws ClassNotFoundException, SQLException {
		VeiculoDAO veiculoDAO = new VeiculoDAO();
		
		
		veiculoDAO.atualizar(veiculo);
	}
	
	
	// Deletar 
	public void deletarBo(int idVeiculo) throws ClassNotFoundException, SQLException {
		VeiculoDAO veiculoDAO = new VeiculoDAO();
		
		
		veiculoDAO.deletar(idVeiculo);
	}		

}
