package fr.univaix.iut.progbd.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import fr.univaix.iut.progbd.beans.Module;
import fr.univaix.iut.progbd.beans.Prof;
import fr.univaix.iut.progbd.dao.DAOProf;

public class DAOProfJPA implements DAOProf {

	private EntityManager entityManager;
	
	public DAOProfJPA(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public boolean delete(Prof obj) {
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

	public List<Prof> FindAll() {
		TypedQuery<Prof> query = entityManager.createNamedQuery(Prof.FIND_ALL, Prof.class);
		return query.getResultList();
	}

	public Prof getById(Integer id) {
		return entityManager.find(Prof.class, id);
	}

	public Prof insert(Prof obj) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.persist(obj);
		tx.commit();
		return entityManager.find(Prof.class, obj.getNumProf());
	}

	public boolean update(Prof obj) {
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

	public List<Prof> findByNom(String nom) {
		TypedQuery<Prof> query = entityManager.createNamedQuery(Prof.FIND_BY_NAME, Prof.class);
		query.setParameter("fnomProf", nom);
		return query.getResultList();
	}

	public List<Prof> findMatSpec(Module matSpec) {
		TypedQuery<Prof> query = entityManager.createNamedQuery(Prof.FIND_BY_MAT_SPEC, Prof.class);
		query.setParameter("fmatSpec", matSpec);
		return query.getResultList();
	}

	public int computeNbProf() {
		return 0;
	}
}
