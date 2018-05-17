package Bean;

import Dao.User.UserDao;
import Dao.User.UserDaoI;
import Entity.User;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Local
@Stateless
public class UserBean implements UserBeanI {

    @Inject
    UserDaoI userDaoI;
    public boolean add(User user) {
        if (userDaoI.add(user))
            return userDaoI.add(user);
        return false;
    }

    public boolean remove(User user) {
        if (userDaoI.remove(user))
            return userDaoI.remove(user);
        return false;
    }

    public boolean edit(User user) {
        if (userDaoI.edit(user))
            return userDaoI.edit(user);
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
