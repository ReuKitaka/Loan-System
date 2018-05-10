package Bean;

import Dao.Client.ClientDao;
import Entity.Client;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import java.util.List;
@Local
@Stateless
public class ClientBean implements ClientBeanI {

    EntityManager em;
    public boolean add(Client client) {
        ClientDao clientDao=new ClientDao(em);
        if (clientDao.add(client))
            return clientDao.add(client);
        return false;
    }

    public boolean remove(Client client) {
        ClientDao clientDao=new ClientDao(em);
        if (clientDao.remove(client))
            return clientDao.remove(client);
        return false;
    }

    public boolean edit(Client client) {
        ClientDao clientDao=new ClientDao(em);
        if (clientDao.edit(client))
            return clientDao.edit(client);
        return false;
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
