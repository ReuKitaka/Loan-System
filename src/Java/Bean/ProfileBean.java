package Bean;

import Dao.Profile.ProfileDao;
import Dao.Profile.ProfileDaoI;
import Entity.Profile;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@Local
@Stateless
public class ProfileBean implements ProfileBeanI{

    EntityManager em;
//    @Inject
//    ProfileDaoI profileDao;

    ProfileDao profileDao=new ProfileDao(em);
    public boolean add(Profile profile) {
        return profileDao.add(profile);
    }

    public boolean remove(Profile profile) {
        return profileDao.remove(profile);
    }

    public boolean edit(Profile profile) {
        return profileDao.edit(profile);
    }

    public Profile viewByIdObj(Profile profile) {
        return null;
    }

    public List<Profile> viewById(Profile profile) {
        return null;
    }

    public List<Profile> viewAll(Profile profile) {
        return null;
    }

    public List<Profile> viewByName(Profile profile) {
        return null;
    }
}
