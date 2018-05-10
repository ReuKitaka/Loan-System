package Dao.Profile;

import Entity.Profile;

import java.util.List;

public interface ProfileDaoI {

    boolean add(Profile profile);

    boolean remove(Profile profile);

    boolean edit(Profile profile);

    Profile viewByIdObj(Profile profile);

    List<Profile> viewById(Profile profile);

    List<Profile> viewAll(Profile profile);
}
