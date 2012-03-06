package fr.univaix.iut.progbd.dao.jdbc;

import java.sql.Connection;
import java.util.List;

import fr.univaix.iut.progbd.beans.Etudiant;
import fr.univaix.iut.progbd.dao.DAOEtudiant;

public class DAOEtudiantJDBC implements DAOEtudiant {
	
	private Connection connection;

	public DAOEtudiantJDBC(Connection connection) {
		this.connection = connection;
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

	public Etudiant insert(Etudiant obj) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean update(Etudiant obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Etudiant getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
