package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Mecanico;
import br.com.fiap.conexoes.ConexaoFactory;

public class MecanicoDAO {

	public Connection minhaConexao;

	public MecanicoDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().Conexao();
	}

	// insert
	public String inserir(Mecanico mecanico) throws SQLException {
		PreparedStatement stmt = minhaConexao
				.prepareStatement("Insert into t_mecanico values (?, ?, ?, ?, ?, ?, ?, ?)");

		stmt.setString(1, mecanico.getNome());
		stmt.setString(2, mecanico.getEmail());
		stmt.setString(3, mecanico.getCpf());
		stmt.setString(4, mecanico.getSenha());
		stmt.setString(5, mecanico.getRg());
		stmt.setString(6, mecanico.getTelefone());
		stmt.setString(7, mecanico.getDataNascimento());
		stmt.setInt(8, mecanico.getIdMecanico());

		return "Mecanico cadastrado com sucesso";
	}

	// Delete
	public String deletar(int idMecanico) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement("Delete from t_mecanico where id_mecanico = ?");
		stmt.setInt(1, idMecanico);
		stmt.execute();
		stmt.close();
		return "Deletado com Sucesso!";
	}

	// UpDate
	public String atualizar(Mecanico mecanico) throws SQLException {
		PreparedStatement stmt = minhaConexao
				.prepareStatement(" Update t_mecanico set nome = ?, "
						+ "email = ?, " + "  cpf = ?," + "senha = ?," + "rg = ?,"
						 + "telefone = ?," + "data_nasc = ? where id_mecanico = ?");
		stmt.setString(1, mecanico.getNome());
		stmt.setString(2, mecanico.getEmail());
		stmt.setString(3, mecanico.getCpf());
		stmt.setString(4, mecanico.getSenha());
		stmt.setString(5, mecanico.getRg());
		stmt.setString(6, mecanico.getTelefone());
		stmt.setString(7, mecanico.getDataNascimento());
		stmt.setInt(8, mecanico.getIdMecanico());
		stmt.executeUpdate();
		stmt.close();
		return "Atualizado com Sucesso!";
	}

	// Select
	public List<Mecanico> selecionar() throws SQLException {
		List<Mecanico> listaMecanico = new ArrayList<Mecanico>();
		PreparedStatement stmt = minhaConexao.prepareStatement("SELECT * FROM t_mecanico");

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			Mecanico mecanico = new Mecanico();
			mecanico.setIdMecanico(rs.getInt(1));
			mecanico.setNome(rs.getString(2));
			mecanico.setEmail(rs.getString(3));
			mecanico.setCpf(rs.getString(4));
			mecanico.setSenha(rs.getString(5));
			mecanico.setRg(rs.getString(6));
			mecanico.setTelefone(rs.getString(7));
			mecanico.setDataNascimento(rs.getString(8));
			listaMecanico.add(mecanico);
		}
		return listaMecanico;
	}

}
