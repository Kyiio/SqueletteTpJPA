package fr.univaix.iut.progbd.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;

import fr.univaix.iut.progbd.beans.Etudiant;
import fr.univaix.iut.progbd.dao.DAOEtudiant;

public class DAOEtudiantJPA implements DAOEtudiant {

	private EntityManager entityManager;
	
	public DAOEtudiantJPA(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public int computeNbEtudiant() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean delete(Etudiant obj) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Etudiant> FindAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Etudiant> findByAnnee(int annee) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Etudiant> findByGroupe(int groupe) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Etudiant> findByNom(String nomEt) {
		// TODO Auto-generated method stub
		return null;
	}

	public Etudiant getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Etudiant insert(Etudiant obj) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean update(Etudiant obj) {
		// TODO Auto-generated method stub
		return false;
	}

}
