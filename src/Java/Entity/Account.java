package Entity;

import javax.persistence.*;
import java.io.Serializable;

@NamedQueries({
        @NamedQuery(
                name = "SelectAllAccounts",
                query = "select c from Account c "
        ),
        @NamedQuery(
                name = "SelectAccountById",
                query = "select c from Account c where c.accountNo=:no"
        )
})

@Entity
@Table(name = "accounts")
public class Account implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "account_no")
    private String accountNo;

    @Column(name = "bank_branch")
    private Branch bankBranch;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public Branch getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(Branch bankBranch) {
        this.bankBranch = bankBranch;
    }
}
