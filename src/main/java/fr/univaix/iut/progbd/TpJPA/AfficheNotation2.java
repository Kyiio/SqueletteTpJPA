package fr.univaix.iut.progbd.TpJPA;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.univaix.iut.progbd.beans.Module;
import fr.univaix.iut.progbd.beans.Notation;
import fr.univaix.iut.progbd.dao.DAOModule;
import fr.univaix.iut.progbd.dao.jpa.DAOFactoryJPA;

public class AfficheNotation2 {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestionPedaPU");
		EntityManager em = emf.createEntityManager();
		
		DAOFactoryJPA daof = new DAOFactoryJPA(em);
		DAOModule daom = daof.createDAOModule();
		Module BD = daom.getById("ACSI");
		Collection <Notation> notes = BD.getNotations();
		for (Notation current : notes)
			System.out.println(current.getEtudiant().getNomEt() + ' ' + current.getNoteCc() + ' ' + current.getNoteTest());
	}

}
