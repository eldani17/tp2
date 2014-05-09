/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aeropuerto;

import ar.edu.untdf.entitys.Cliente;
import ar.edu.untdf.entitys.Ticket;
import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author DAndrade
 */
public class Aeropuerto {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf1 = null;
        EntityManager em1 = null;
        EntityTransaction tx1 = null;
        
        // TODO code application logic here
        //lecturaTabla();
        Cliente c = new Cliente();
        c.setApellido("ooo");
        c.setNombre("ooo");
        c.setDni(Long.parseLong("3333"));
        //c.setDireccion("qweqeqw");
        //c.setEmail("email");
        //c.setTelefono("21312");
        
        emf1 = Persistence.createEntityManagerFactory("AeropuertoPU");
        em1 = emf1.createEntityManager();
        tx1 = em1.getTransaction();
        try {
            tx1.begin();
            em1.persist(c);
            em1.flush();
            tx1.commit();
        } 
        catch(Exception e) {
            tx1.rollback();
        }
        //lecturaTabla();
    }
    
    private static void newCliente(){
        
        
        
        /*Ticket t = new Ticket();
        //t.setId(Long.parseLong("3838"));
        t.setNombre("ticket99");
       // t.setCliente(c);
        escribirTicket(t);
        */
        
        
        
        
    }
    
    private static void deleteRegistro(Long clave)
    {
        /*CREO OBJETO CLIENTE Y LO GUARDO*/
        EntityManagerFactory emf1 = Persistence.createEntityManagerFactory("AeropuertoPU");
        EntityManager em1 = emf1.createEntityManager();
        
        try {
            EntityTransaction tx1 = em1.getTransaction();
            tx1.begin();
            
            Cliente c = em1.find(Cliente.class, clave);
            em1.remove(c);
            tx1.commit();
        } 
        finally{
            em1.close();
        }
        emf1.close();
    }
    
    private static void updateTabla(Long clave)
    {
        /*CREO OBJETO CLIENTE Y LO GUARDO*/
        EntityManagerFactory emf1 = Persistence.createEntityManagerFactory("AeropuertoPU");
        EntityManager em1 = emf1.createEntityManager();
        
        try {
            EntityTransaction tx1 = em1.getTransaction();
            tx1.begin();
            
            Cliente c = em1.find(Cliente.class, clave);
            c.setApellido("nuevo");
            tx1.commit();
        } 
        finally{
            em1.close();
        }
        emf1.close();
    }
    
    private void escribirTabla(Cliente c)
    {
        /*CREO OBJETO CLIENTE Y LO GUARDO*/
        /*emf1 = Persistence.createEntityManagerFactory("AeropuertoPU");
        em1 = emf1.createEntityManager();
        tx1 = em1.getTransaction();
        try {
            tx1.begin();
            em1.persist(c);
            em1.flush();
            tx1.commit();
        } 
        catch(Exception e) {
            tx1.rollback();
        }*/
        /*em1.close();
        emf1.close();*/
    }
    
    private static void escribirTicket(Ticket t)
    {
        /*CREO OBJETO CLIENTE Y LO GUARDO*/
        EntityManagerFactory emf1 = Persistence.createEntityManagerFactory("AeropuertoPU");
        EntityManager em1 = emf1.createEntityManager();
        EntityTransaction tx1 = em1.getTransaction();
        try {
            tx1.begin();
            em1.persist(t);
            tx1.commit();
        } 
        catch(Exception e) {
            tx1.rollback();
        }
        em1.close();
        emf1.close();
    }
    
    private static void lecturaTabla()
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("AeropuertoPU");
        EntityManager em = emf.createEntityManager();
        
        try {
            EntityTransaction t = em.getTransaction();
            t.begin();
            Query query = em.createQuery("SELECT cli FROM Cliente cli");
            List list = query.getResultList();
            Iterator iterator = list.iterator();
            System.out.println("Lista de Clientes ");
            System.out.println("Id      Nombre      Apellido ");
            while (iterator.hasNext())
            {
                Cliente c = (Cliente)iterator.next();
                System.out.println(c.getId() + "    " +
                    c.getApellido() + "     " + c.getNombre() + "   " + c.getDni());
            }
            t.commit();
        } 
        finally{
            em.close();
        }
        emf.close();  
    }
}
