package Bean;

import Entity.User;

import javax.ejb.Local;
import java.util.List;

@Local
public interface UserBeanI {

    boolean add(User user);

    boolean remove(User user);

    boolean edit(User user);

    User viewByIdObj(User user);

    List<User> viewById(User user);

    List<User> viewAll(User user);

    List<User> viewByUname(User user);
}
