package br.com.alan.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;

/*
 * @author Alan
 * Implementação Singleton para o Entity Factory
 */

public class EntityManagerFactorySingleton {

	@PersistenceUnit
	private static EntityManagerFactory entityManagerFactory 
		= Persistence.createEntityManagerFactory("tarefas-web-service");

	private EntityManagerFactorySingleton() {

	}

	public static EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}
}
