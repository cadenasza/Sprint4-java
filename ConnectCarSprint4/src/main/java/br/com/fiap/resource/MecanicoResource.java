package br.com.fiap.resource;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import br.com.fiap.beans.Mecanico;
import br.com.fiap.bo.MecanicoBO;

@Path("/mecanico")
public class MecanicoResource {
	
	private MecanicoBO mecanicoBO = new MecanicoBO();
	
	// Selecionar 
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Mecanico> selecionarRs() throws ClassNotFoundException, SQLException{
		return (ArrayList<Mecanico>) mecanicoBO.selecionarBo();
	}
	
	// Inserir 
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response inserirRs(Mecanico mecanico, @Context UriInfo uriInfo ) throws ClassNotFoundException, SQLException {
		
		mecanicoBO.inserirBo(mecanico);
		
		UriBuilder builder = uriInfo.getAbsolutePathBuilder();
		builder.path(Integer.toString(mecanico.getIdMecanico()));
		return Response.created(builder.build()).build();			
	}
	
	// Atualizar 
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualizarRs(Mecanico mecanico, @PathParam("idMecanico") int idMecanico) throws ClassNotFoundException, SQLException {
		mecanicoBO.atualizarBo(mecanico);
		
		return Response.ok().build();
	}
	
	// Deletar
	@DELETE
	@Path("/{idMecanico}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deletarRs(@PathParam("idMecanico") int idMecanico) throws ClassNotFoundException, SQLException {
		
		mecanicoBO.deletarBo(idMecanico);
		return Response.ok().build();
	}
	
}
