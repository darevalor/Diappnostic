package edu.uniandes.diappnostic.rest;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Stateless
@Path("servicios")
public class DiappnosticRS {

	@GET
	@Path("estado")
	public Response consultarEstadoServicio(){
		String estado = "Servicio en funcionamiento.";
		return Response.status(200).entity(estado).build();
	}
}
