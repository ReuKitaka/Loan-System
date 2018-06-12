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
        return branchDao.add(branch);
    }

    public boolean remove(Branch branch) {
        return branchDao.remove(branch);
    }

    public boolean edit(Branch branch) {
        return branchDao.edit(branch);
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
