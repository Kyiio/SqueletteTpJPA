package fr.univaix.iut.progbd.dao.jdbc;

import java.sql.Connection;
import java.util.List;

import fr.univaix.iut.progbd.beans.Module;
import fr.univaix.iut.progbd.beans.Prof;
import fr.univaix.iut.progbd.dao.DAOProf;

public class DAOProfJDBC implements DAOProf {

	private Connection connection;
	
	public DAOProfJDBC(Connection connection) {
		this.connection = connection;
	}

	public boolean delete(Prof obj) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Prof> FindAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Prof getById(Integer id) {
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
