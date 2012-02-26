package fr.univaix.iut.progbd.dao;

public interface DAOFactory {
	public DAOEtudiant createDAOEtudiant();
	public DAOProf createDAOProf();
	public DAOModule createDAOModule();
}
