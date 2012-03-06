package fr.univaix.iut.progbd.dao;

import java.util.List;

import fr.univaix.iut.progbd.beans.Module;
import fr.univaix.iut.progbd.beans.Prof;

public interface DAOModule extends DAO<Module, String> {
	public List<Module> findByLibelle(String libelle);
	public List<Module> findByDiscipline(String discipline);
	public List<Module> findByResponsable(Prof Responsable);
}
