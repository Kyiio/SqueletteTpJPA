package fr.univaix.iut.progbd.TpJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.univaix.iut.progbd.beans.Module;

public class AfficheHierarchieModules {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestionPedaPU");
		EntityManager em = emf.createEntityManager();

		Module BD = em.find(Module.class, "BD");
		for (Module mod = BD.getPere(); mod != null; mod = mod.getPere())
			System.out.println(BD.getCode() + " a pour pere le module " + mod.getCode() + '.');

		em.close();
		emf.close();
	}
}
