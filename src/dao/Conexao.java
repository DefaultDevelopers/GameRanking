package dao;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Conexao {
	private Connection conexao;
	private String url = "jdbc:mysql://localhost/";
	private String banco = "bdgameranking";
	private String usuario = "root";
	private String senha = "";

	public Conexao() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexao = DriverManager.getConnection(url + banco, usuario, senha);
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found in System, =)");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("BD not found in System, =)");
			e.printStackTrace();
		}

	}

	public Connection retornaConexao() {

		return (this.conexao);

	}

}
