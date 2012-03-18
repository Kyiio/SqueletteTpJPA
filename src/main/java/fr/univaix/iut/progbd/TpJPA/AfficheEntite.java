package fr.univaix.iut.progbd.TpJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.univaix.iut.progbd.beans.Etudiant;

public class AfficheEntite 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestionPedaPU");
        EntityManager em = emf.createEntityManager();
        
        Etudiant etud = em.find(Etudiant.class, 1106);
        System.out.println(etud);

        em.close();
        emf.close();
    }
}
