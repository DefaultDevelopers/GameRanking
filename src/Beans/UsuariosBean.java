package Beans;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import entidades.Usuario;
import funcoes.UserListagem;
import funcoes.UserSalva;

@RequestScoped
@ManagedBean(name = "bUser")
public class UsuariosBean {
	
	private List<Usuario> UserList;
	private Usuario usuario = new Usuario();
	private String senha;
	
	FacesContext context = FacesContext.getCurrentInstance();
	
	public List<Usuario> getUserList() {
		return new UserListagem().recuperaLista(this.UserList);
	}

	public void setUserList(List<Usuario> userList) {
		UserList = userList;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void salvar(){
		if (usuario.getSenha().equals(senha)){
			new UserSalva().salva(usuario);
			this.usuario = new Usuario();
		}
		else {
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro!",  "Senhas não conferem") );
			usuario.setSenha(null);
			this.senha = null;
		}
	}
	
	public void remover(Usuario usuario){
		new UserSalva().remove(usuario);
	}
	
}
