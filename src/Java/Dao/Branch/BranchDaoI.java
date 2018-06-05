package Dao.Branch;

import Entity.Branch;

import javax.ejb.Local;
import java.util.List;

public interface BranchDaoI {

    boolean add(Branch branch);

    boolean remove(Branch branch);

    boolean edit(Branch branch);

    Branch viewByIdObj(Branch branch);

    List<Branch> viewById(Branch branch);

    List<Branch> viewAll(Branch branch);

    List<Branch> viewByName(Branch branch);
}
