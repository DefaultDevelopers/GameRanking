package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
	
	public ArrayList<Usuario>listar(){
			
		ArrayList<Usuario> listaUser;
		listaUser = new ArrayList<Usuario>();
		
		sql = "select * from usuario";
		try {
			psmt = con.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()){
				Usuario user = new Usuario();
				user.setId(rs.getInt("idusuario"));
				user.setNome(rs.getString("nome"));
				user.setEmail(rs.getString("email"));
				user.setSenha(rs.getString("senha"));
				user.setAdm(rs.getBoolean("admin"));
				listaUser.add(user);
				
				
				//System.out.println(rs.getString("nome"));
				//System.out.println(rs.getString("email"));
				//System.out.println(rs.getString("senha"));
			//	System.out.println(rs.getBoolean("admin"));
				//
			} 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return(listaUser);
		
	}

	
	
}
