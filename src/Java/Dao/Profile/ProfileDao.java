package Dao.Profile;

import Dao.CustomDao;
import Entity.Profile;

import javax.persistence.EntityManager;
import java.util.List;

public class ProfileDao extends CustomDao<Profile> implements ProfileDaoI{
    public ProfileDao(EntityManager entityManager) {
        super(entityManager);
    }

    public boolean add(Profile profile) {
        if (addCustom(profile))
            return this.addCustom(profile);
        return false;
    }

    public boolean remove(Profile profile) {
        if (customeDelete(profile))
            return this.customeDelete(profile);
        return false;
    }

    public boolean edit(Profile profile) {
        if (editCustom(profile))
            return this.editCustom(profile);
        return false;
    }

    public Profile viewByIdObj(Profile profile) {
        return null;
    }

    public List<Profile> viewById(Profile profile) {
        return null;
    }

    public List<Profile> viewAll(Profile profile) {
        try {
            return
                    entityManager.createNamedQuery("SelectAllProfiles").getResultList();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
