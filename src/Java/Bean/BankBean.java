package Bean;

import Dao.Bank.BankDao;
import Entity.Bank;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import java.util.List;

@Stateless
public class BankBean implements BankBeanI {

    EntityManager em;
    BankDao bankDao=new BankDao(em);
    public boolean add(Bank bank) {
        return bankDao.add(bank);
    }

    public boolean remove(Bank bank) {
        return bankDao.remove(bank);
    }

    public boolean edit(Bank bank) {
        return bankDao.edit(bank);
    }

    public Bank viewByIdObj(Bank bank) {

        return null;
    }

    public List<Bank> viewById(Bank bank) {
        return bankDao.viewById(bank);
    }

    public List<Bank> viewAll(Bank bank) {
        return bankDao.viewAll(bank);
    }

    public List<Bank> viewByName(Bank bank) {
        return bankDao.viewByName(bank);
    }
}
