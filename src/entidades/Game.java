package entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Game {

	@Id
	@GeneratedValue
	private int id;
	
	private String titulo;
	private String marca;
	private String plataforma;
	private String faixaetaria;
	
	@ManyToOne
	private Genero genero;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public String getFaixaetaria() {
		return faixaetaria;
	}

	public void setFaixaetaria(String faixaetaria) {
		this.faixaetaria = faixaetaria;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public int getId() {
		return id;
	}
	
	
}
