package funcoes;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import dao.DAO;
import entidades.Usuario;

public class UserSalva {

	private DAO<Usuario> dao = new DAO<Usuario>(Usuario.class);
	FacesContext context = FacesContext.getCurrentInstance();
	
	public void salva(Usuario usuario){
		dao.salva(usuario);
		context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!",  "Usuário " + usuario.getNome() + " adicionado.") );
	}
	
	public void remove(Usuario usuario){
		dao.remover(usuario);
		context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!",  "Usuário " + usuario.getNome() + " removido.") );
	}
}
