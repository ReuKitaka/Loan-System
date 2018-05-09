package Entity;

import Entity.Enums.YesNo;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "loans")
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name ="name")
    String name;

    @Column(name = "interest")
    Double interest;

    @Column(name ="loan_amount")
    Double amount;

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

    public Double getInterest() {
        return interest;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
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
}
