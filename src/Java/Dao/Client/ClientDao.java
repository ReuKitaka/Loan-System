package Dao.Client;

import Dao.CustomDao;
import Entity.Client;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

public class ClientDao extends CustomDao<Client> implements ClientDaoI{
    public ClientDao(EntityManager entityManager) {
        super(entityManager);
    }

    public boolean add(Client client){
        if (addCustom(client))
            return  this.addCustom(client);
        return false;
    }

    public boolean edit(Client client) {
        if (editCustom(client))
            return this.editCustom(client);
        return false;
    }

    public boolean approve(Client client) {
        return false;
    }

    public Client viewByIdObj(Client client) {
        try {
            List<Client>clientList=entityManager.createNamedQuery("SelectById")
                    .setParameter("id",client.getClientNo()).getResultList();
            return clientList.size()>0?clientList.get(0):null;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

    public List<Client> viewById(Client client) {
        try {
            return entityManager.createNamedQuery("SelectById")
                    .setParameter("id",client.getClientNo()).getResultList();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

    public List<Client> viewAll(Client client) {
        List<Client> clientList=new ArrayList<Client>();
        try {
            return entityManager.createNamedQuery("SelectAllClients").getResultList();
        }catch (Exception e){
         e.printStackTrace();
            return null;
        }
    }

    public Long getNextClientNo(Long clientId) {
        return null;
    }

    public boolean remove(Client client){
        if (customeDelete(client))
            return this.customeDelete(client);
        return false;
    }
}
