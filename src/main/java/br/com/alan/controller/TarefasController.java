package br.com.alan.controller;

import br.com.alan.dao.TarefaDAO;
import br.com.alan.model.Tarefa;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/tarefas")
public class TarefasController {
	
	private TarefaDAO tarefaDAO = new TarefaDAO();
	
	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Tarefa> listarTarefas(){
		return tarefaDAO.listar();
	}
}
