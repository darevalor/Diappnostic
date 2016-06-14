package edu.uniandes.diappnostic.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import edu.uniandes.diappnostic.dto.EpisodioDto;
import edu.uniandes.diappnostic.entities.Episodio;
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
		EpisodioDto episodio = gsonBuilder.fromJson(jsonRequest, EpisodioDto.class);
		
		servicioGestor.registrarEpisodio(episodio);
		
		return Response.status(200).entity(episodio.getNumDocUsuario()).build();
		
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("consultar/{id}")
	public Response consultarEpisodio(@PathParam("id") long id) {		
		List<Episodio> listaEpisodios = servicioGestor.consultarEpisodios(id);
		
		String response = "";
		for(Episodio episodio : listaEpisodios) {
			
			Gson gson = new GsonBuilder()
		               .registerTypeAdapter(Episodio.class, new MyTypeAdapter<Episodio>())
		               .create();
			
			response = gson.toJson(episodio);
		}
		
//		String response = new Gson().toJson(listaEpisodios); l
		return Response.status(200).entity(response).build();
		

	}
	
	
    
}
