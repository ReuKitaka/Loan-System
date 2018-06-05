package Bean;

import Dao.Branch.BranchDao;
import Entity.Branch;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@Local
@Stateless
public class BranchBean implements BranchBeanI{

//    @Inject
//    BranchDao branchDao;
    EntityManager em;
    BranchDao branchDao=new BranchDao(em);


    public boolean add(Branch branch) {
        if (branchDao.add(branch))
            return branchDao.add(branch);
        return false;
    }

    public boolean remove(Branch branch) {
        if (branchDao.remove(branch))
            return branchDao.remove(branch);
        return false;
    }

    public boolean edit(Branch branch) {
        if (branchDao.edit(branch))
            return branchDao.edit(branch);
        return false;
    }

    public Branch viewByIdObj(Branch branch) {
        return branchDao.viewByIdObj(branch);
    }

    public List<Branch> viewById(Branch branch) {
        return branchDao.viewById(branch);
    }

    public List<Branch> viewAll(Branch branch) {
        return branchDao.viewAll(branch);
    }

    public List<Branch> viewByName(Branch branch) {
        return branchDao.viewByName(branch);
    }
}
