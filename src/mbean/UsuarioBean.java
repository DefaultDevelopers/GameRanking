package mbean;

import javax.faces.bean.ManagedBean;

import dao.DAOusuario;
import entidades.Usuario;

@ManagedBean
public class UsuarioBean {
	private Usuario user = new Usuario();
	
   public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}
	
	public void salvar(){
		DAOusuario daouser = new DAOusuario();
	    daouser.salvar(user);
	    System.out.println("SALVOU");
		
	}

}
