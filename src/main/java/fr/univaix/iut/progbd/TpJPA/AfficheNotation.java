package fr.univaix.iut.progbd.TpJPA;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.univaix.iut.progbd.beans.Module;
import fr.univaix.iut.progbd.beans.Notation;

public class AfficheNotation {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestionPedaPU");
		EntityManager em = emf.createEntityManager();
		
		Module BD = em.find(Module.class,"BD");
		Collection <Notation> notes = BD.getNotations();
		for (Notation current : notes)
			System.out.println(current.getEtudiant().getNomEt() + ' ' + current.getNoteCc() + ' ' + current.getNoteTest());
	}

}
