package Dao.Branch;

import Dao.CustomDao;
import Entity.Branch;

import javax.persistence.EntityManager;
import java.util.List;

public class BranchDao extends CustomDao<Branch> implements BranchDaoI{
    public BranchDao(EntityManager entityManager) {
        super(entityManager);
    }

    public boolean add(Branch branch) {
        if (addCustom(branch))
            return addCustom(branch);
        return false;
    }

    public boolean remove(Branch branch) {
        if (customeDelete(branch))
            return customeDelete(branch);
        return false;
    }

    public boolean edit(Branch branch) {
        if (editCustom(branch))
            return editCustom(branch);
        return false;
    }

    public Branch viewByIdObj(Branch branch) {
        return null;
    }

    public List<Branch> viewById(Branch branch) {
        return null;
    }

    public List<Branch> viewAll(Branch branch) {
        return null;
    }

    public List<Branch> viewByName(Branch branch) {
        return null;
    }
}
