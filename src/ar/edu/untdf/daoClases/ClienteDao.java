/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.daoClases;

import ar.edu.untdf.entitys.Cliente;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author DAndrade
 */
public class ClienteDao {
    
    public static void saveCliente(Cliente c)
    {
        EntityManagerFactory emf1 = Persistence.createEntityManagerFactory("AeropuertoPU");
        EntityManager em1 = emf1.createEntityManager();
        EntityTransaction tx1 = em1.getTransaction();
        try {
            tx1.begin();
            em1.persist(c);
            tx1.commit();
        } 
        catch(Exception e) {
            tx1.rollback();
        }
        em1.close();
        emf1.close();
    }
}
