package Entity;

import Entity.Enums.LoanSecurity;
import Entity.Enums.YesNo;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@NamedQueries({
        @NamedQuery(
                name = "SelectAll",
                query = "select l from Loan l "
        ),
        @NamedQuery(
                name = "SelectById",
                query = "select l from Loan l where l.loanNo=:no"
        )
})
@Entity
@Table(name = "loans")
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "loan_no")
    String loanNo;

    @Column(name ="name")
    String name;

    @Column(name = "collateral_type")
    String collateralType;

    @Column(name = "security")
    @Enumerated(EnumType.STRING)
    LoanSecurity securityType;

    @Column(name = "interest")
    BigDecimal interest;

    @Column(name ="loan_amount")
    BigDecimal amount;

    @Column(name = "deadline")
    Date deadline;

    @Column(name = "authorised")
    @Enumerated(EnumType.STRING)
    YesNo authorised;

    @Column(name ="authorise_by")
    String authorisedBy;

    @Column(name = "amount_disbursed")
    Double amountDisbursed;

    @Column(name = "date_disbursed")
    Date dateDisbursed;

    @Column(name = "date_authorise")
    Date dateAuthorised;

    @OneToOne
    Client client;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo;
    }

    public String getName() {
        return name;
    }

    public String getCollateralType() {
        return collateralType;
    }

    public void setCollateralType(String collateralType) {
        this.collateralType = collateralType;
    }

    public LoanSecurity getSecurityType() {
        return securityType;
    }

    public void setSecurityType(LoanSecurity securityType) {
        this.securityType = securityType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public YesNo getAuthorised() {
        return authorised;
    }

    public void setAuthorised(YesNo authorised) {
        this.authorised = authorised;
    }

    public String getAuthorisedBy() {
        return authorisedBy;
    }

    public void setAuthorisedBy(String authorisedBy) {
        this.authorisedBy = authorisedBy;
    }

    public Double getAmountDisbursed() {
        return amountDisbursed;
    }

    public void setAmountDisbursed(Double amountDisbursed) {
        this.amountDisbursed = amountDisbursed;
    }

    public Date getDateDisbursed() {
        return dateDisbursed;
    }

    public void setDateDisbursed(Date dateDisbursed) {
        this.dateDisbursed = dateDisbursed;
    }

    public Date getDateAuthorised() {
        return dateAuthorised;
    }

    public void setDateAuthorised(Date dateAuthorised) {
        this.dateAuthorised = dateAuthorised;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
