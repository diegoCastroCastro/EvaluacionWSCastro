package ec.edu.ups.evaluacion.modelo.dao;

import java.sql.Connection;
import java.sql.SQLException;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import ec.edu.ups.evaluacion.modelo.Universidad;



@Stateless
public class UniversidadDAO {

	@Inject
	private Connection con;
	
	@Inject
	private EntityManager em;
	
	public boolean insertJPA (Universidad entity) throws SQLException{
		em.persist(entity);
		return true;
	}
	
	public boolean update (Universidad entity) {
		em.merge(entity);
		return true;
	}
	
	public Universidad read (String id) {
		try {
			Universidad u = em.find(Universidad.class, id);
		return u;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean delete (String id) {
		Universidad u = em.find(Universidad.class, id);
		em.remove(u);
		return true;
	}
}
