package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Veiculo;
import br.com.fiap.dao.VeiculoDAO;

public class TesteCadastrarVeiculo {
	
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
		
		Veiculo objVeiculo = new Veiculo();
		VeiculoDAO dao = new VeiculoDAO();
		objVeiculo.setIdVeiculo(inteiro("Insira o codigo do veiculo: "));
		objVeiculo.setChassi(texto("Insira o chassi do veiculo: "));
		objVeiculo.setPlaca(texto("Insira a placa do veiculo: "));
		
		System.out.println(dao.inserir(objVeiculo));
	}

}
