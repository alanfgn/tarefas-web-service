package br.com.alan.dao;

import java.util.List;

public interface InterfaceRepositoryDAO<T> {
	
	public void criar(T objeto);
	
	public void deletar(T objeto);
	
	public T pegar(Integer id);
	
	public void atualizar(T objeto);
	
	public List<T> listar();

}
