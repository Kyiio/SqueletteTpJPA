package fr.univaix.iut.progbd.TpJPA;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.univaix.iut.progbd.beans.Module;
import fr.univaix.iut.progbd.beans.Prof;


public class AfficheSpecialistes {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestionPedaPU");
		EntityManager em = emf.createEntityManager();
		
		Module BD = em.find( Module.class,"BD");
		System.out.println( BD.getCode() + " a pour specialistes : ");
		Collection <Prof> specialistes = BD.getSpecialistes();
		for ( Prof profCour : specialistes )
			System.out.println( profCour.getNomProf()+' ' + profCour.getPrenomProf());
	} 
}
