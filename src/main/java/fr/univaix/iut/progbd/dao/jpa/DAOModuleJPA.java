package fr.univaix.iut.progbd.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;

import fr.univaix.iut.progbd.beans.Module;
import fr.univaix.iut.progbd.beans.Prof;
import fr.univaix.iut.progbd.dao.DAOModule;

public class DAOModuleJPA implements DAOModule {

	private EntityManager entityManager;
	
	public DAOModuleJPA(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public boolean delete(Module obj) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Module> FindAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Module getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Module insert(Module obj) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean update(Module obj) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Module> findByLibelle(String libelle) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Module> findByDiscipline(String discipline) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Module> findByResponsable(Prof Responsable) {
		// TODO Auto-generated method stub
		return null;
	}

}