package Dao.Branch;

import Dao.CustomDao;
import Entity.Branch;

import javax.ejb.Stateless;
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
        try {
            List<Branch>branchList=entityManager.createNamedQuery("SelectBranchById")
                    .setParameter("id",branch.getCode()).getResultList();
            return branchList.size()>0?branchList.get(0):null;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public List<Branch> viewById(Branch branch) {
        try {
            return entityManager.createNamedQuery("SelectBranchById")
                    .setParameter("id",branch.getCode()).getResultList();
        }catch (Exception e){
            return null;
        }
    }

    public List<Branch> viewAll(Branch branch) {
        try {
            return entityManager.createNamedQuery("SelectAllBranches").getResultList();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public List<Branch> viewByName(Branch branch) {
        try {
            return entityManager.createNamedQuery("SelectBranchByName")
                    .setParameter("bname",branch.getName()).getResultList();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
