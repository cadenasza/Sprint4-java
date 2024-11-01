package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Veiculo;
import br.com.fiap.dao.VeiculoDAO;

public class TesteAtualizarVeiculo {
	
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
		Veiculo objVeiculo = new Veiculo();
		
		VeiculoDAO dao = new VeiculoDAO();
		
		objVeiculo.setIdVeiculo(inteiro("Insira o codigo a ser alterado"));
		objVeiculo.setChassi(texto("Chassi: "));
		objVeiculo.setPlaca(texto("Placa"));
		System.out.println(dao.atualizar(objVeiculo));

	}
	

}
