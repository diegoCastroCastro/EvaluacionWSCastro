package ec.edu.ups.evaluacion.modelo.negocio;

import javax.ejb.Local;

import ec.edu.ups.evaluacion.modelo.Persona;
import ec.edu.ups.evaluacion.modelo.Titulo;
import ec.edu.ups.evaluacion.modelo.Universidad;

@Local
public interface GestionUniversidadONLocal {
	
	public boolean registrarPersona(Persona persona) throws Exception;
	public boolean registrarUniversidad(Universidad universidad) throws Exception;
	public boolean registrarTitulo(Titulo titulo) throws Exception;

}
