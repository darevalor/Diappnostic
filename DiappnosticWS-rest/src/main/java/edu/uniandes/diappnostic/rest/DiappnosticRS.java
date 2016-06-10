package edu.uniandes.diappnostic.rest;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import edu.uniandes.diappnostic.dto.Episodio;
import edu.uniandes.diappnostic.servicios.IServicioGestor;

@Path("/servicios")
@Stateless
public class DiappnosticRS {
	
	/**
	 * 
	 */
	@EJB
	private IServicioGestor servicioGestor;

	@GET
	@Path("estado/")
	public Response consultarEstadoServicio(){
		String estado = "Servicio en funcionamiento.";
		return Response.status(200).entity(estado).build();
	}
	
	/**
	 * 
	 * @param episodio
	 */
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("registrar/")
	public Response registrarEpisodio(String jsonRequest) {
		Gson gsonBuilder = new GsonBuilder().create();
		Episodio episodio = gsonBuilder.fromJson(jsonRequest, Episodio.class);
		
		servicioGestor.registrarEpisodio(episodio);
		
		return Response.status(200).entity(episodio.getConsecutivo()).build();
		
	}
	
	
    
}
