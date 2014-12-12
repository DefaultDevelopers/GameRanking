package entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Pontuacao {
	
	@Id
	@GeneratedValue
	private int id;
	
	@ManyToOne
	private Game game;
	
	@ManyToOne
	private Usuario usuario;
	
	private int pontuação;
	private boolean liberar;
	
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public int getPontuação() {
		return pontuação;
	}
	public void setPontuação(int pontuação) {
		this.pontuação = pontuação;
	}
	public boolean isLiberar() {
		return liberar;
	}
	public void setLiberar(boolean liberar) {
		this.liberar = liberar;
	}
	public int getId() {
		return id;
	}
	
	
}
