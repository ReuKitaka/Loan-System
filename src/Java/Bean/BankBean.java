package Bean;

import Dao.Bank.BankDao;
import Entity.Bank;

import javax.persistence.EntityManager;
import java.util.List;

public class BankBean implements BankBeanI {

    EntityManager em;
    BankDao bankDao=new BankDao(em);
    public boolean add(Bank bank) {
        if (bankDao.add(bank))
            return bankDao.add(bank);
        return false;
    }

    public boolean remove(Bank bank) {

         if (bankDao.remove(bank))
             return bankDao.remove(bank);
        return false;
    }

    public boolean edit(Bank bank) {
        if (bankDao.edit(bank))
            return bankDao.edit(bank);
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
