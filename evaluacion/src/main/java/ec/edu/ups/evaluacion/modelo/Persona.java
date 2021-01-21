package ec.edu.ups.evaluacion.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persona implements Serializable{
	
	@Id
	private String cedula;
	private String nombre;
	private String titulo;
	private String universidad;
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getUniversidad() {
		return universidad;
	}
	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}

}
