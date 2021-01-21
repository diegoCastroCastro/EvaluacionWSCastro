package ec.edu.ups.evaluacion.modelo.services;

import javax.inject.Inject;
import javax.ws.rs.Path;

import ec.edu.ups.evaluacion.modelo.negocio.GestionUniversidadONLocal;

@Path("universidad")
public class ServiceRest {
	
	@Inject
	private GestionUniversidadONLocal on;
	
	

}
