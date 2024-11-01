package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Veiculo;
import br.com.fiap.dao.VeiculoDAO;

public class TesteDeletarVeiculo {
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Instanciar objetos 
		Veiculo objVeiculo = new Veiculo();
		
		VeiculoDAO dao = new VeiculoDAO();
		
		objVeiculo.setIdVeiculo(inteiro("Digite o codigo do veiculo a ser deletado"));
		
		System.out.println(dao.deletar(objVeiculo.getIdVeiculo()));

	}

}
