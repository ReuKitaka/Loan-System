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
        return null;
    }

    public List<Bank> viewById(Bank bank) {
        return null;
    }

    public List<Bank> viewAll(Bank bank) {
        return null;
    }

    public List<Bank> viewByName(Bank bank) {
        return null;
    }
}
