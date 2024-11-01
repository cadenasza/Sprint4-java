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

import br.com.fiap.beans.Cliente;
import br.com.fiap.bo.ClienteBO;

@Path("/cliente")
public class ClienteResource {
	
	private ClienteBO clienteBO = new ClienteBO();
	
	// Selecionar 
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Cliente> selecionarRs() throws ClassNotFoundException, SQLException{
		return (ArrayList<Cliente>) clienteBO.selecionarBo();
	}
	
	// Inserir 
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response inserirRs(Cliente cliente, @Context UriInfo uriInfo ) throws ClassNotFoundException, SQLException {
		
		clienteBO.inserirBo(cliente);
		
		UriBuilder builder = uriInfo.getAbsolutePathBuilder();
		builder.path(Integer.toString(cliente.getIdCliente()));
		return Response.created(builder.build()).build();			
	}
	
	// Atualizar 
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualizarRs(Cliente cliente, @PathParam("idCliente") int idCliente) throws ClassNotFoundException, SQLException {
		clienteBO.atualizarBo(cliente);
		
		return Response.ok().build();
	}
	
	// Deletar
	@DELETE
	@Path("/{idCliente}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deletarRs(@PathParam("idCliente") int idCliente) throws ClassNotFoundException, SQLException {
		
		clienteBO.deletarBo(idCliente);
		return Response.ok().build();
	}
	
}
