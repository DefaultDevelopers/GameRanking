package Beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import entidades.Usuario;
import funcoes.UserListagem;

@RequestScoped
@ManagedBean(name = "bUser")
public class Usuarios {

	private List<Usuario> UserList;

	public List<Usuario> getUserList() {
		return new UserListagem().recuperaLista(this.UserList);
	}

	public void setUserList(List<Usuario> userList) {
		UserList = userList;
	}
	
}
