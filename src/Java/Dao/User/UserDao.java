package Dao.User;

import Bean.UserBeanI;
import Dao.CustomDao;
import Entity.User;

import javax.persistence.EntityManager;
import java.util.List;

public class UserDao extends CustomDao<User> implements UserBeanI{
    public UserDao(EntityManager entityManager) {
        super(entityManager);
    }

    public boolean add(User user) {
        if (addCustom(user))
            return  this.addCustom(user);
        return false;
    }

    public boolean remove(User user) {
        if (customeDelete(user))
            return this.customeDelete(user);
        return false;
    }

    public boolean edit(User user) {
        if (editCustom(user))
            return this.editCustom(user);
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
