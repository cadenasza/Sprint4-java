package br.com.fiap.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fiap.beans.Mecanico;
import br.com.fiap.dao.MecanicoDAO;

public class MecanicoBO {
	
	MecanicoDAO mecanicoDao;
	
	// Selecionar 
	public ArrayList<Mecanico> selecionarBo() throws ClassNotFoundException, SQLException{
		mecanicoDao = new MecanicoDAO();
		
		return (ArrayList<Mecanico>) mecanicoDao.selecionar();
	}
	
	// Inserir 
	public void inserirBo(Mecanico mecanico) throws ClassNotFoundException, SQLException {
		MecanicoDAO mecanicoDAO = new MecanicoDAO();
		
		
		mecanicoDAO.inserir(mecanico);
	}
	
	// Atualizar 
	public void atualizarBo(Mecanico mecanico) throws ClassNotFoundException, SQLException {
		MecanicoDAO mecanicoDAO = new MecanicoDAO();
		
		
		mecanicoDAO.atualizar(mecanico);
	}
	
	
	// Deletar 
	public void deletarBo(int idMecanico) throws ClassNotFoundException, SQLException {
		MecanicoDAO mecanicoDAO = new MecanicoDAO();
		
		
		mecanicoDAO.deletar(idMecanico);
	}		

}
