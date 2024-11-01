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

import br.com.fiap.beans.Veiculo;
import br.com.fiap.bo.VeiculoBO;

@Path("/veiculo")
public class VeiculoResource {
	
	private VeiculoBO veiculoBO = new VeiculoBO();
	
	// Selecionar 
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Veiculo> selecionarRs() throws ClassNotFoundException, SQLException{
		return (ArrayList<Veiculo>) veiculoBO.selecionarBo();
	}
	
	// Inserir 
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response inserirRs(Veiculo veiculo, @Context UriInfo uriInfo ) throws ClassNotFoundException, SQLException {
		
		veiculoBO.inserirBo(veiculo);
		
		UriBuilder builder = uriInfo.getAbsolutePathBuilder();
		builder.path(Integer.toString(veiculo.getIdVeiculo()));
		return Response.created(builder.build()).build();			
	}
	
	// Atualizar 
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualizarRs(Veiculo veiculo, @PathParam("idVeiculo") int idVeiculo) throws ClassNotFoundException, SQLException {
		veiculoBO.atualizarBo(veiculo);
		
		return Response.ok().build();
	}
	
	// Deletar
	@DELETE
	@Path("/{idVeiculo}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deletarRs(@PathParam("idVeiculo") int idVeiculo) throws ClassNotFoundException, SQLException {
		
		veiculoBO.deletarBo(idVeiculo);
		return Response.ok().build();
	}
	
}
