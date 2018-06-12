package Bean;

import Dao.Client.ClientDao;
import Entity.Client;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Local
@Stateless
public class ClientBean implements ClientBeanI {

    @PersistenceContext
    EntityManager em;
    public boolean add(Client client) {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++Just to get the em"+em);
        ClientDao clientDao=new ClientDao(em);
            return clientDao.add(client);
    }

    public boolean remove(Client client) {
        ClientDao clientDao=new ClientDao(em);
        return clientDao.remove(client);
    }

    public boolean edit(Client client) {
        ClientDao clientDao=new ClientDao(em);
        return clientDao.edit(client);
    }

    public boolean approve(Client client) {
        return false;
    }

    public Client viewByIdObj(Client client) {
        ClientDao clientDao=new ClientDao(em);
        return clientDao.viewByIdObj(client);
    }

    public List<Client> viewById(Client client) {
        ClientDao clientDao=new ClientDao(em);
        return clientDao.viewById(client);
    }

    public List<Client> viewAll(Client client) {
        ClientDao clientDao=new ClientDao(em);
        return clientDao.viewAll(client);
    }

    public Long getNextClientNo(Long clientId) {
        return null;
    }
}
