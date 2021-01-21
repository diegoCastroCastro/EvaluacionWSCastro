package ec.edu.ups.evaluacion.modelo.dao;

import java.sql.Connection;
import java.sql.SQLException;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import ec.edu.ups.evaluacion.modelo.Titulo;


@Stateless
public class TituloDAO {

	@Inject
	private Connection con;
	
	@Inject
	private EntityManager em;
	
	public boolean insertJPA (Titulo entity) throws SQLException{
		em.persist(entity);
		return true;
	}
	
	public boolean update (Titulo entity) {
		em.merge(entity);
		return true;
	}
	
	public Titulo read (String id) {
		try {
			Titulo t = em.find(Titulo.class, id);
		return t;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean delete (String id) {
		Titulo t = em.find(Titulo.class, id);
		em.remove(t);
		return true;
	}
}
