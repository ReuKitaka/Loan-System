package Bean;

import Entity.Bank;
import Entity.Client;
import Entity.Loan;

import java.math.BigDecimal;
import java.util.List;

public interface LoanBeanI {

    boolean authorise(Loan loan);

    boolean payLoan(Loan loan);

    boolean disburse(Loan loan);

    void calcInterest(BigDecimal persInterest, BigDecimal loanAmount);

    Loan viewByIdObj(Loan loan);

    List<Loan> viewById(Loan loan);

    List<Loan> viewAll(Loan loan);

    List<Client> viewByHolderName(Client client);


}
