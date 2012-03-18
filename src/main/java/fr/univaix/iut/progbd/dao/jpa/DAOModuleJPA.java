package fr.univaix.iut.progbd.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import fr.univaix.iut.progbd.beans.Module;
import fr.univaix.iut.progbd.beans.Prof;
import fr.univaix.iut.progbd.dao.DAOModule;

public class DAOModuleJPA implements DAOModule {

	private EntityManager entityManager;
	
	public DAOModuleJPA(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public boolean delete(Module obj) {
		try {
			EntityTransaction tx = entityManager.getTransaction();
			tx.begin();
			entityManager.remove(obj);
			tx.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public List<Module> FindAll() {
		TypedQuery<Module> query = entityManager.createNamedQuery(Module.FIND_ALL, Module.class);
		return query.getResultList();
	}

	public Module getById(String id) {
		return entityManager.find(Module.class, id);
	}

	public Module insert(Module obj) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.persist(obj);
		tx.commit();
		return entityManager.find(Module.class, obj.getCode());
	}

	public boolean update(Module obj) {
		try {
			EntityTransaction tx = entityManager.getTransaction();
			tx.begin();
			entityManager.merge(obj);
			tx.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public List<Module> findByLibelle(String libelle) {
		TypedQuery<Module> query = entityManager.createNamedQuery(Module.FIND_BY_LIBELLE, Module.class);
		query.setParameter("flibelle", libelle);
		return query.getResultList();
	}

	public List<Module> findByDiscipline(String discipline) {
		TypedQuery<Module> query = entityManager.createNamedQuery(Module.FIND_BY_DISCIPLINE, Module.class);
		query.setParameter("fdiscipline", discipline);
		return query.getResultList();
	}

	public List<Module> findByResponsable(Prof responsable) {
		TypedQuery<Module> query = entityManager.createNamedQuery(Module.FIND_BY_RESPONSABLE, Module.class);
		query.setParameter("fresponsable", responsable);
		return query.getResultList();
	}

}
