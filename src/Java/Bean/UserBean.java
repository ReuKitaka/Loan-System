package Bean;

import Entity.User;

import javax.ejb.Local;
import javax.ejb.Stateless;
import java.util.List;

@Local
@Stateless
public class UserBean implements UserBeanI {
    public boolean add(User user) {
        return false;
    }

    public boolean remove(User user) {
        return false;
    }

    public boolean edit(User user) {
        return false;
    }

    public User viewByIdObj(User user) {
        return null;
    }

    public List<User> viewById(User user) {
        return null;
    }

    public List<User> viewAll(User user) {
        return null;
    }
}
