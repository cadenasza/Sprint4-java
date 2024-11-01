package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Mecanico;
import br.com.fiap.dao.MecanicoDAO;

public class TesteDeletarMecanico {
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Instanciar objetos 
		Mecanico objMecanico = new Mecanico();
		
		MecanicoDAO dao = new MecanicoDAO();
		
		objMecanico.setIdMecanico(inteiro("Digite o codigo do Mecanico a ser deletado"));
		
		System.out.println(dao.deletar(objMecanico.getIdMecanico()));

	}

}
