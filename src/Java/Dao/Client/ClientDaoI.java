package Dao.Client;

import Entity.Client;

import java.util.List;

public interface ClientDaoI {
    boolean add(Client client);

    boolean remove(Client client);

    boolean edit(Client client);

    boolean approve(Client client);

    Client viewByIdObj(Client client);

    List<Client> viewById(Client client);

    List<Client> viewAll(Client client);

    public Long getNextClientNo(Long clientId) ;
}
