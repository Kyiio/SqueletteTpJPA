package fr.univaix.iut.progbd.dao;

import java.util.List;

import fr.univaix.iut.progbd.beans.Etudiant;

public interface DAOEtudiant extends DAO<Etudiant>{

	public int computeNbEtudiant();

	public List<Etudiant> findByAnnee(int annee);

	public List<Etudiant> findByGroupe(int groupe);

	public List<Etudiant> findByNom(String nomEt);

}