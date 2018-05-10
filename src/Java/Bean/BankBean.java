package Bean;

import Entity.Bank;

import java.util.List;

public class BankBean implements BankBeanI {
    public boolean add(Bank bank) {
        return false;
    }

    public boolean remove(Bank bank) {
        return false;
    }

    public boolean edit(Bank bank) {
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
