package ec.edu.ups.evaluacion.modelo.negocio;

import java.sql.SQLException;
import java.util.Date;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.evaluacion.modelo.Persona;
import ec.edu.ups.evaluacion.modelo.Titulo;
import ec.edu.ups.evaluacion.modelo.Universidad;
import ec.edu.ups.evaluacion.modelo.dao.PersonaDAO;
import ec.edu.ups.evaluacion.modelo.dao.TituloDAO;
import ec.edu.ups.evaluacion.modelo.dao.UniversidadDAO;


@Stateless
public class GestionUniversidadON implements GestionUniversidadONLocal {
	
	@Inject
	private PersonaDAO daoPersona;
	
	@Inject
	private TituloDAO daoTitulo;
	
	@Inject
	private UniversidadDAO daoUniversidad;
	
	public boolean registrarPersona(Persona persona) throws Exception {
		
		if (persona.getCedula().length()!=10) {
			throw new Exception("Cedula Incorrecta");
		}
		try {
			daoPersona.insertJPA(persona);
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new Exception("Error al registrar persona");
		}
		return true;
	}
	
	public boolean registrarUniversidad(Universidad universidad) throws Exception {
		
		try {
			daoUniversidad.insertJPA(universidad);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("Error al registrar universidad");
		}
		return true;
	}
	
public boolean registrarTitulo(Titulo titulo) throws Exception {
		
		try {
			daoTitulo.insertJPA(titulo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("Error al registrar titulo");
		}
		return true;
	}

}
