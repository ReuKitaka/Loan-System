package Bean;

import Dao.Profile.ProfileDao;
import Dao.Profile.ProfileDaoI;
import Entity.Profile;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Local
@Stateless
public class ProfileBean implements ProfileBeanI{

    @Inject
    ProfileDaoI profileDao;
    public boolean add(Profile profile) {
        if (profileDao.add(profile))
            return profileDao.add(profile);
        return false;
    }

    public boolean remove(Profile profile) {
        if (profileDao.remove(profile))
            return profileDao.remove(profile);
        return false;
    }

    public boolean edit(Profile profile) {
        if (profileDao.edit(profile))
            return profileDao.edit(profile);
        return false;
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
