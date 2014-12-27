package teste;

import java.util.ArrayList;

import dao.DAOusuario;
import entidades.Usuario;

public class TestaAplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Usuario usu = new Usuario();
		//usu.setNome("Lipe");
		//usu.setEmail("lipe@hotmail.com");
		//usu.setSenha("12345");
		//usu.setAdm(true);
		
		DAOusuario daousu = new DAOusuario();
		ArrayList<Usuario> listar = daousu.listar();
		
		for(Usuario usuario : listar){
			System.out.println("Usuario: "+ usuario.getNome());
			
			
			
		}
		//daousu.salvar(usu);
		
	}

}
