package Bean;

import Entity.Profile;

import javax.ejb.Local;
import java.util.List;

@Local
public interface ProfileBeanI {

    boolean add(Profile profile);

    boolean remove(Profile profile);

    boolean edit(Profile profile);

    Profile viewByIdObj(Profile profile);

    List<Profile> viewById(Profile profile);

    List<Profile> viewAll(Profile profile);

    List<Profile> viewByName(Profile profile);
}
