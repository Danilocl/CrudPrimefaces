package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Produto;

public class ProdutoDao {
	
	public void insertProduto(Produto p) {
		
		Connection con = ConnectionFactory.getConnection();
		try {
			PreparedStatement command = con.prepareStatement("INSERT INTO produto (nome, preco) VALUES (?, ?)");

			command.setString(1, p.getNome());
			command.setString(2, p.getPreco());

			command.executeUpdate();
			command.close();
			con.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	
	public void updateProduto(Produto p) {

		Connection con = ConnectionFactory.getConnection();
		try {
			PreparedStatement command = con.prepareStatement("UPDATE produto SET nome = ?, preco = ? WHERE id = ?");

			command.setInt(3, p.getId());
			command.setString(1, p.getNome());
			command.setString(2, p.getPreco());

			command.executeUpdate();
			command.close();
			con.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
	
	public void deletProduto(Produto p) {

		Connection con = ConnectionFactory.getConnection();
		try {
			PreparedStatement command = con.prepareStatement("DELETE FROM preco WHERE id = ?");

			command.setInt(1, p.getId());

			command.executeUpdate();
			command.close();
			con.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	
	public ArrayList<Produto> selectProduto(){
		Connection con = ConnectionFactory.getConnection();
		
		ArrayList<Produto> list = new ArrayList<Produto>();
		
		try {
			PreparedStatement command = con.prepareStatement("SELECT * FROM produto");

			ResultSet rs = command.executeQuery();

			 while (rs.next()) {
				 Produto p = new Produto();
				 p.setId(rs.getInt("id"));
				 p.setNome(rs.getString("nome"));
				 p.setPreco(rs.getString("preco"));
				 list.add(p);
			 }

			rs.close();
			command.close();

		} catch (SQLException e) {

			e.printStackTrace();

		}
		
		return null;
	}

}
