package fr.univaix.iut.progbd.TpJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.univaix.iut.progbd.beans.Module;
import fr.univaix.iut.progbd.beans.Prof;


public class AfficheResponsable 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestionPedaPU");
        EntityManager em = emf.createEntityManager();
  
        Module BD = em.find(Module.class, "BD");
        Prof num = BD.getResponsable();
        System.out.println("Le module " +BD.getCode() + " a pour responsable " + num.getNomProf() +'.');

        em.close();
        emf.close();
    }
}

