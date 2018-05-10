package Dao.Bank;

import Entity.Bank;

import java.util.List;

public interface BankDaoI {

    boolean add(Bank bank);

    boolean remove(Bank bank);

    boolean edit(Bank bank);

    Bank viewByIdObj(Bank bank);

    List<Bank> viewById(Bank bank);

    List<Bank> viewAll(Bank bank);

    List<Bank> viewByName(Bank bank);
}
