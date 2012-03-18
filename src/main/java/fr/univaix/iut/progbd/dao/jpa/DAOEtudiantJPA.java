package fr.univaix.iut.progbd.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import fr.univaix.iut.progbd.beans.Etudiant;
import fr.univaix.iut.progbd.dao.DAOEtudiant;

public class DAOEtudiantJPA implements DAOEtudiant {

	private EntityManager entityManager;

	public DAOEtudiantJPA(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public int computeNbEtudiant() {
		return 0;
	}

	public Etudiant insert(Etudiant obj) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.persist(obj);
		tx.commit();
		return entityManager.find(Etudiant.class, obj.getNumEt());
	}

	public boolean update(Etudiant obj) {
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

	public boolean delete(Etudiant obj) {
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

	public Etudiant getById(Integer id) {
		return entityManager.find(Etudiant.class, id);
	}
	
	public List<Etudiant> FindAll() {
		TypedQuery<Etudiant> query = entityManager.createNamedQuery(Etudiant.FIND_ALL, Etudiant.class);
		return query.getResultList();
	}

	public List<Etudiant> findByAnnee(int annee) {
		TypedQuery<Etudiant> query = entityManager.createNamedQuery(Etudiant.FIND_BY_YEAR, Etudiant.class);
		query.setParameter("fannee", annee);
		return query.getResultList();
	}

	public List<Etudiant> findByGroupe(int groupe) {
		TypedQuery<Etudiant> query = entityManager.createNamedQuery(Etudiant.FIND_BY_GROUP, Etudiant.class);
		query.setParameter("fgroupe", groupe);
		return query.getResultList();
	}

	public List<Etudiant> findByNom(String nomEt) {
		TypedQuery<Etudiant> query = entityManager.createNamedQuery(Etudiant.FIND_BY_NAME, Etudiant.class);
		query.setParameter("fnomEt", nomEt);
		return query.getResultList();
	}
}