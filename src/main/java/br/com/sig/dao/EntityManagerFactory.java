package br.com.sig.dao;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

@SuppressWarnings("serial")
public class EntityManagerFactory implements Serializable {
	public static final String PERSISTENCE_UNIT = "sig";
	protected static EntityManager entityManager;

	public static EntityManager getEntityManager() {
		if (entityManager == null) {
			javax.persistence.EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
			entityManager = factory.createEntityManager();
		}
		return entityManager;
	}

	public static void setEntityManager(EntityManager entityManager) {
		EntityManagerFactory.entityManager = entityManager;
	}
}
