package Bean;

import Entity.Client;
import Entity.Loan;

import java.math.BigDecimal;
import java.util.List;

public class LoanBean implements LoanBeanI{

    public boolean authorise(Loan loan) {
        return false;
    }

    public boolean payLoan(Loan loan) {
        return false;
    }

    public boolean disburse(Loan loan) {
        return false;
    }

    public void calcInterest(BigDecimal persInterest, BigDecimal loanAmount) {

    }

    public Loan viewByIdObj(Loan loan) {
        return null;
    }

    public List<Loan> viewById(Loan loan) {
        return null;
    }

    public List<Loan> viewAll(Loan loan) {
        return null;
    }

    public List<Client> viewByHolderName(Client client) {
        return null;
    }
}
