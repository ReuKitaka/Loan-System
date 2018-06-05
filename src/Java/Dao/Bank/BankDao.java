package Dao.Bank;

import Dao.CustomDao;
import Entity.Bank;

import javax.persistence.EntityManager;
import java.util.List;

public class BankDao extends CustomDao<Bank> implements BankDaoI{
    public BankDao(EntityManager entityManager) {
        super(entityManager);
    }

    public boolean add(Bank bank) {
        if (addCustom(bank))
            return addCustom(bank);
        return false;
    }

    public boolean remove(Bank bank) {
        if (customeDelete(bank))
            return customeDelete(bank);
        return false;
    }

    public boolean edit(Bank bank) {
        if (editCustom(bank))
            return editCustom(bank);
        return false;
    }

    public Bank viewByIdObj(Bank bank) {
        try {
            List<Bank>brankList=entityManager.createNamedQuery("SelectBankById")
                    .setParameter("id",bank.getCode()).getResultList();
            return brankList.size()>0?brankList.get(0):null;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public List<Bank> viewById(Bank bank) {
        try {
            return entityManager.createNamedQuery("SelectBankById")
                    .setParameter("id",bank.getCode()).getResultList();
        }catch (Exception e){
            return null;
        }
    }

    public List<Bank> viewAll(Bank bank) {
        try {
            return entityManager.createNamedQuery("SelectAllBanks").getResultList();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public List<Bank> viewByName(Bank bank) {
        try {
            return entityManager.createNamedQuery("SelectBankByName")
                    .setParameter("bname",bank.getName()).getResultList();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }
}
