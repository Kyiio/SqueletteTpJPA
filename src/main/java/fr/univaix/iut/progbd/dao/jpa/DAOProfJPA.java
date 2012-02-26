package fr.univaix.iut.progbd.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;

import fr.univaix.iut.progbd.beans.Module;
import fr.univaix.iut.progbd.beans.Prof;
import fr.univaix.iut.progbd.dao.DAOProf;

public class DAOProfJPA implements DAOProf {

	private EntityManager entityManager;
	
	public DAOProfJPA(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public boolean delete(Prof obj) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Prof> FindAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Prof getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Prof insert(Prof obj) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean update(Prof obj) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Prof> findByNom(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Prof> findMatSpec(Module matSpec) {
		// TODO Auto-generated method stub
		return null;
	}

	public int computeNbProf() {
		// TODO Auto-generated method stub
		return 0;
	}
}
