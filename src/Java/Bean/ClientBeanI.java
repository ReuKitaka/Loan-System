package Bean;

import Entity.Client;

import javax.ejb.Local;
import java.util.List;

@Local
public interface ClientBeanI {

    boolean add(Client client);

    boolean remove(Client client);

    boolean edit(Client client);

    boolean approve(Client client);

    Client viewByIdObj(Client client);

    List<Client> viewById(Client client);

    List<Client> viewAll(Client client);

    public Long getNextClientNo(Long clientId) ;
}
