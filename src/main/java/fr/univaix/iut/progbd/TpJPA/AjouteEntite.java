package fr.univaix.iut.progbd.TpJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.univaix.iut.progbd.beans.Module;

public class AjouteEntite {
	public static void main(String[] args) throws InterruptedException {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("gestionPedaPU");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		Module mod = new Module("PROGBD");
		mod.setLibelle("PERSISTANCE EN JAVA");
		mod.setCoefCc(5);
		em.persist(mod);
		System.out.println(mod.toString());
		em.getTransaction().commit();

		em.getTransaction().begin();
		Thread.sleep(60000);
		em.remove(mod);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}
}
