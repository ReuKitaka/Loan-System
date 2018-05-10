package Bean;

import Entity.Profile;

import javax.ejb.Local;
import javax.ejb.Stateless;
import java.util.List;

@Local
@Stateless
public class ProfileBean implements ProfileBeanI{
    public boolean add(Profile profile) {
        return false;
    }

    public boolean remove(Profile profile) {
        return false;
    }

    public boolean edit(Profile profile) {
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
