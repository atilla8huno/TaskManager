package br.com.unimix.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author ATILLA
 */
public class JPAUtil {
    
    public static EntityManager getEntityManager(){
        EntityManagerFactory emf    = null;
        EntityManager em            = null;
        try {
            emf = Persistence.createEntityManagerFactory("TaskManagerPU");
            em = emf.createEntityManager();
            return em;
        } catch (Exception e){
            e.printStackTrace();
        }
        return em;
    }
    
    public static boolean close(EntityManager em){
        try {
            em.close();
            return true;
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
    public static boolean begin(EntityManager em){
        try {
            em.getTransaction().begin();
            return true;
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
    public static boolean commit(EntityManager em){
        try {
            em.getTransaction().commit();
            return true;
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
    public static boolean rollback(EntityManager em){
        try {
            em.getTransaction().rollback();
            return true;
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
