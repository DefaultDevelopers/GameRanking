package entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Genero {
	
	@Id
	@GeneratedValue
	private int id;
	private String Descri��o;
	
	public String getDescri��o() {
		return Descri��o;
	}
	public void setDescri��o(String descri��o) {
		Descri��o = descri��o;
	}
	public int getId() {
		return id;
	}
	

}
