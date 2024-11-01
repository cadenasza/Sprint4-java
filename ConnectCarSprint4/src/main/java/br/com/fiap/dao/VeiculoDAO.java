package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Veiculo;
import br.com.fiap.conexoes.ConexaoFactory;

public class VeiculoDAO {

	public Connection minhaConexao;

	public VeiculoDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().Conexao();
	}

	// insert
	public String inserir(Veiculo veiculo) throws SQLException {
		PreparedStatement stmt = minhaConexao
				.prepareStatement("Insert into t_veiculo values (?, ?, ?)");

		stmt.setString(1, veiculo.getChassi());
		stmt.setString(2, veiculo.getPlaca());
		stmt.setInt(3, veiculo.getIdVeiculo());
		

		return "Veiculo cadastrado com sucesso";
	}

	// Delete
	public String deletar(int IdVeiculo) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement("Delete from t_veiculo where id_veiculo = ?");
		stmt.setInt(1, IdVeiculo);
		stmt.execute();
		stmt.close();
		return "Deletado com Sucesso!";
	}

	// UpDate
	public String atualizar(Veiculo veiculo) throws SQLException {
		PreparedStatement stmt = minhaConexao
				.prepareStatement(" Update t_veiculo set chassi = ?, "
						+ "placa = ?, " + " placa = ? where id_veiculo = ?");
		stmt.setString(1, veiculo.getChassi());
		stmt.setString(2, veiculo.getPlaca());
		stmt.setInt(3, veiculo.getIdVeiculo());
		stmt.executeUpdate();
		stmt.close();
		return "Atualizado com Sucesso!";
	}

	// Select
	public List<Veiculo> selecionar() throws SQLException {
		List<Veiculo> listaVeiculo = new ArrayList<Veiculo>();
		PreparedStatement stmt = minhaConexao.prepareStatement("SELECT * FROM t_veiculo");

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			Veiculo veiculo = new Veiculo();
			veiculo.setIdVeiculo(rs.getInt(1));
			veiculo.setChassi(rs.getString(2));
			veiculo.setPlaca(rs.getString(3));
			listaVeiculo.add(veiculo);
		}
		return listaVeiculo;
	}

}
