package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entidades.Usuario;



public class DAOusuario {

	private Connection con;
	private PreparedStatement psmt;
	private ResultSet rs;
	private String sql;
	private Conexao conexao;
	
	public DAOusuario() {
		conexao = new Conexao();
		con = conexao.retornaConexao();
		
		
	}
	
	public void salvar(Usuario usuario){
		 sql ="insert into usuario(nome,email,senha,admin)values(?,?,?,?)";
		 
		 try {
			psmt = con.prepareStatement(sql);
			psmt.setString(1, usuario.getNome());
			psmt.setString(2, usuario.getEmail());
			psmt.setString(3, usuario.getSenha());
			psmt.setBoolean(4,  usuario.isAdm());
			psmt.execute();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	
	
}
