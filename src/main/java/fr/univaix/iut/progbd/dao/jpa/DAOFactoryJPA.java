package fr.univaix.iut.progbd.dao.jpa;

import javax.persistence.EntityManager;

import fr.univaix.iut.progbd.dao.DAOEtudiant;
import fr.univaix.iut.progbd.dao.DAOFactory;
import fr.univaix.iut.progbd.dao.DAOModule;
import fr.univaix.iut.progbd.dao.DAOProf;

public class DAOFactoryJPA implements DAOFactory {
	
	private EntityManager entityManager;

	public DAOFactoryJPA(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public DAOEtudiant createDAOEtudiant() {
		return new DAOEtudiantJPA(entityManager);
	}

	public DAOProf createDAOProf() {
		return new DAOProfJPA(entityManager);
	}

	public DAOModule createDAOModule() {
		return new DAOModuleJPA(entityManager);
	}

}
