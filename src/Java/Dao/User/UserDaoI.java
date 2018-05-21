package Dao.User;

import Entity.User;

import java.util.List;

public interface UserDaoI {

    boolean add(User user);

    boolean remove(User user);

    boolean edit(User user);

    User viewByIdObj(User user);

    List<User> viewById(User user);

    List<User> viewAll(User user);

    List<User> viewByUname(User user);
}
