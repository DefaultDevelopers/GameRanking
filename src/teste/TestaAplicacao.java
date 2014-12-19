package teste;

import dao.DAOusuario;
import entidades.Usuario;

public class TestaAplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Usuario usu = new Usuario();
		usu.setNome("Lipe");
		usu.setEmail("lipe@hotmail.com");
		usu.setSenha("12345");
		usu.setAdm(true);
		
		DAOusuario daousu = new DAOusuario();
		daousu.salvar(usu);
	}

}
