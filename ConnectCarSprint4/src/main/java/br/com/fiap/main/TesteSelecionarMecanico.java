package br.com.fiap.main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Mecanico;
import br.com.fiap.dao.MecanicoDAO;

public class TesteSelecionarMecanico {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Instanciar objetos 
		MecanicoDAO dao = new MecanicoDAO();
		
		List<Mecanico> listaMecanico = (ArrayList<Mecanico>) dao.selecionar();
		
		if(listaMecanico != null) {
			// foreach 
			for( Mecanico mecanico : listaMecanico) {
				System.out.println(mecanico.getIdMecanico() + " " + 
						mecanico.getNome() + " " + 
						mecanico.getEmail() + " " + 
						mecanico.getCpf() + " " +
						mecanico.getSenha() + " " +
						mecanico.getRg() + " " +
						mecanico.getTelefone() + " " +
						mecanico.getDataNascimento() + " ");
			}
		}

	}

}
