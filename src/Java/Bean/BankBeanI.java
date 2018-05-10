package Bean;

import Entity.Bank;

import javax.ejb.Local;
import java.util.List;

@Local
public interface BankBeanI {

    boolean add(Bank bank);

    boolean remove(Bank bank);

    boolean edit(Bank bank);

    Bank viewByIdObj(Bank bank);

    List<Bank> viewById(Bank bank);

    List<Bank> viewAll(Bank bank);

    List<Bank> viewByName(Bank bank);
}
