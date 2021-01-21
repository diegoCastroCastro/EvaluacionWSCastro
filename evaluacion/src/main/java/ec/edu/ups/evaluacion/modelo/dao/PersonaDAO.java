package ec.edu.ups.evaluacion.modelo.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import ec.edu.ups.evaluacion.modelo.Persona;




@Stateless
public class PersonaDAO {

	@Inject
	private Connection con;
	
	@Inject
	private EntityManager em;
	
	public boolean insertJPA (Persona entity) throws SQLException{
		em.persist(entity);
		return true;
	}
	
	public boolean update (Persona entity) {
		em.merge(entity);
		return true;
	}
	
	public Persona read (String id) {
		try {
		Persona p = em.find(Persona.class, id);
		return p;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean delete (String id) {
		Persona p = em.find(Persona.class, id);
		em.remove(p);
		return true;
	}
}
