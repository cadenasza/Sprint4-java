package br.com.fiap.main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Veiculo;
import br.com.fiap.dao.VeiculoDAO;

public class TesteSelecionarVeiculo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Instanciar objetos 
		VeiculoDAO dao = new VeiculoDAO();
		
		List<Veiculo> listaVeiculo = (ArrayList<Veiculo>) dao.selecionar();
		
		if(listaVeiculo != null) {
			// foreach 
			for( Veiculo veiculo : listaVeiculo) {
				System.out.println(veiculo.getIdVeiculo() + " " + 
									veiculo.getChassi() + " " + 
									veiculo.getPlaca() + " ");
			}
		}

	}

}
