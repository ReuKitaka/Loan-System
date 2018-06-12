package Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;

import static org.jboss.aesh.terminal.Key.S;

public class CustomDao<T> {

    protected EntityManager entityManager;

    public CustomDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    public boolean addCustom(T t){
        try{
            System.out.println("===================================================Still good here"+t.toString());
            entityManager.persist(t);
            System.out.println("===================================================And here too");
            return true;
        }catch (PersistenceException px){
            System.out.println("===================================================Problem occured here");
            px.printStackTrace();
            return  false;
        }
    }

    public boolean editCustom(T t) {
        try {
            entityManager.merge(t);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }

    }

    public boolean customeDelete(T t){
        try {
            entityManager.merge(t);
            entityManager.remove(t);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
