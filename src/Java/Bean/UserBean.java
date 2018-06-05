package Bean;

import Dao.User.UserDao;
import Dao.User.UserDaoI;
import Entity.User;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@Local
@Stateless
public class UserBean implements UserBeanI {


    EntityManager em;
//    @Inject
//    UserDaoI userDaoI;

    UserDao userDaoI=new UserDao(em);
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

    public List<User> viewByUname(User user) {
        return null;
    }
}
