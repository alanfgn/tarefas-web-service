package br.com.alan.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Criteria;
import org.hibernate.Session;

import br.com.alan.model.Tarefa;

public class TarefaDAO implements InterfaceRepositoryDAO<Tarefa> {

	private EntityManager entityManager = EntityManagerFactorySingleton.getEntityManagerFactory().createEntityManager();

	@Override
	public void criar(Tarefa tarefa) {
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(tarefa);
		} finally {
			entityManager.getTransaction().commit();
		}
	}

	@Override
	public void deletar(Tarefa tarefa) {
		try {
			entityManager.getTransaction().begin();
			entityManager.remove(tarefa);
		} finally {
			entityManager.getTransaction().commit();
		}
	}

	@Override
	public Tarefa pegar(Integer id) {
		try {
			entityManager.getTransaction().begin();
			return (Tarefa) entityManager.find(Tarefa.class, id);
		} finally {
			entityManager.getTransaction().commit();
		}
	}

	@Override
	public void atualizar(Tarefa tarefa) {
		try {
			entityManager.getTransaction().begin();
			entityManager.merge(tarefa);
		} finally {
			entityManager.getTransaction().commit();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Tarefa> listar() {
		try {
			entityManager.getTransaction().begin();
			return (List<Tarefa>) entityManager.createQuery("from tb_tarefas").getResultList();
		} finally {
			entityManager.getTransaction().commit();
		}
	}

	// Somente com Hibernate
	@SuppressWarnings("unchecked")
	public List<Tarefa> listarCriteria() {

		Session session = (Session) entityManager.getDelegate();
		Criteria tarefaCriteria = session.createCriteria(Tarefa.class);

		try {
			session.getTransaction().begin();
			return tarefaCriteria.list();
		} finally {
			session.getTransaction().commit();
		}

	}

}
