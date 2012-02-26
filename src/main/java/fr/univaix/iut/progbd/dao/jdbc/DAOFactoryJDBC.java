package fr.univaix.iut.progbd.dao.jdbc;

import java.sql.Connection;

import fr.univaix.iut.progbd.dao.DAOEtudiant;
import fr.univaix.iut.progbd.dao.DAOFactory;
import fr.univaix.iut.progbd.dao.DAOModule;
import fr.univaix.iut.progbd.dao.DAOProf;

public class DAOFactoryJDBC implements DAOFactory {

	private Connection connection;
	
	public DAOFactoryJDBC(Connection connection) {
		this.connection = connection;
	}

	public DAOEtudiant createDAOEtudiant() {
		return new DAOEtudiantJDBC(connection);
	}

	public DAOProf createDAOProf() {
		return new DAOProfJDBC(connection);
	}

	public DAOModule createDAOModule() {
		return new DAOModuleJDBC(connection);
	}
}
