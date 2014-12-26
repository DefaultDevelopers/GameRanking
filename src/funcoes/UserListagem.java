package funcoes;

import java.util.List;

import entidades.Usuario;

public class UserListagem {

	public List<Usuario> recuperaLista(List<Usuario> userList) {
		userList = new dao.DAO<Usuario>(Usuario.class).listar();
		System.out.println("Recuperando Lista de Usuário no Banco de Dados");
		return userList;
	}
}
