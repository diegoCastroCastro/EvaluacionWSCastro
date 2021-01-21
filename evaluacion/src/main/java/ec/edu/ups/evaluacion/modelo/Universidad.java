package ec.edu.ups.evaluacion.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Universidad implements Serializable{
	
	@Id
	private int id;
	private String nombre;
	private String direccion;
	private Persona persona;
	private Titulo titulo;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public Titulo getTitulo() {
		return titulo;
	}
	public void setTitulo(Titulo titulo) {
		this.titulo = titulo;
	}
	
	

}
