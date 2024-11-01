package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Cliente;
import br.com.fiap.conexoes.ConexaoFactory;

public class ClienteDAO {

	public Connection minhaConexao;

	public ClienteDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().Conexao();
	}

	// insert
	public String inserir(Cliente cliente) throws SQLException {
		PreparedStatement stmt = minhaConexao
				.prepareStatement("Insert into t_cliente values (?, ?, ?, ?, ?, ?, ?, ?)");

		stmt.setString(1, cliente.getNome());
		stmt.setString(2, cliente.getEmail());
		stmt.setString(3, cliente.getCnh());
		stmt.setString(4, cliente.getSenha());
		stmt.setString(5, cliente.getRg());
		stmt.setString(6, cliente.getTelefone());
		stmt.setString(7, cliente.getDataNascimento());
		stmt.setInt(8, cliente.getIdCliente());

		return "Cliente cadastrado com sucesso";
	}

	// Delete
	public String deletar(int idCliente) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement("Delete from t_cliente where id_cliente = ?");
		stmt.setInt(1, idCliente);
		stmt.execute();
		stmt.close();
		return "Deletado com Sucesso!";
	}

	// UpDate
	public String atualizar(Cliente cliente) throws SQLException {
		PreparedStatement stmt = minhaConexao
				.prepareStatement(" Update t_cliente set NOME = ?, "
						+ "EMAIL = ?, " + "  CNH = ?," +  "SENHA = ?," + "RG = ?,"
						 + "TELEFONE = ?," + "DATA_NASC = ? where id_cliente = ?");
		stmt.setString(1, cliente.getNome());
		stmt.setString(2, cliente.getEmail());
		stmt.setString(3, cliente.getCnh());
		stmt.setString(4, cliente.getSenha());
		stmt.setString(5, cliente.getRg());
		stmt.setString(6, cliente.getTelefone());
		stmt.setString(7, cliente.getDataNascimento());
		stmt.setInt(8, cliente.getIdCliente());
		stmt.executeUpdate();
		stmt.close();
		return "Atualizado com Sucesso!";
	}

	// Select
	public List<Cliente> selecionar() throws SQLException {
		List<Cliente> listaCliente = new ArrayList<Cliente>();
		PreparedStatement stmt = minhaConexao.prepareStatement("SELECT * FROM t_cliente");

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			Cliente cliente = new Cliente();
			cliente.setIdCliente(rs.getInt(1));
			cliente.setNome(rs.getString(2));
			cliente.setEmail(rs.getString(3));
			cliente.setCnh(rs.getString(4));
			cliente.setSenha(rs.getString(5));
			cliente.setRg(rs.getString(6));
			cliente.setTelefone(rs.getString(7));
			cliente.setDataNascimento(rs.getString(8));
			listaCliente.add(cliente);
		}
		return listaCliente;
	}

}
