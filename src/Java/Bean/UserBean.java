package Bean;

import Dao.User.UserDao;
import Entity.User;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Local
@Stateless
public class UserBean implements UserBeanI {


    @PersistenceContext
    EntityManager em;
//    @Inject
//    UserDaoI userDao;


    public boolean add(User user) {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++Just to get the em"+em);
        UserDao userDao =new UserDao(em);
        return userDao.add(user);
    }

    public boolean remove(User user) {
        UserDao userDao =new UserDao(em);
        return userDao.remove(user);
    }

    public boolean edit(User user) {
        UserDao userDao =new UserDao(em);
        return userDao.edit(user);
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
