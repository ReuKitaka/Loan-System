package Bean;

import Entity.Branch;

import javax.ejb.Local;
import javax.ejb.Stateless;
import java.util.List;

@Local
@Stateless
public class BranchBean implements BranchBeanI{
    public boolean add(Branch branch) {
        return false;
    }

    public boolean remove(Branch branch) {
        return false;
    }

    public boolean edit(Branch branch) {
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
