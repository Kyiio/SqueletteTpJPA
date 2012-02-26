package fr.univaix.iut.progbd.dao;

import java.util.List;

import fr.univaix.iut.progbd.beans.Module;
import fr.univaix.iut.progbd.beans.Prof;

public interface DAOProf extends DAO<Prof> {
	public List<Prof> findByNom(String nom);
	public List<Prof> findMatSpec(Module matSpec);
	public int computeNbProf();
}
