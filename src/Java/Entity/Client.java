package Entity;

import Entity.Enums.Status;
import Entity.Enums.YesNo;
import Entity.Person;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;



@NamedQueries({
        @NamedQuery(
                name = "SelectAllClients",
                query = "select c from Client c "
        ),
        @NamedQuery(
                name = "SelectById",
                query = "select c from Client c where c.clientNo=:id"
        )
})

@Entity
@Table(name = "clients")
public class Client extends Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "client_no", nullable = true)
    private String clientNo;

    @OneToOne(cascade = CascadeType.ALL)
    private Photo memberPhoto;

    @Embedded
    private Entity.Address address;

    @Column(name = "facebook")
    private  String facebook;

    @Column(name="twitter")
    private String twitter;


    @Column(name="linkedIn")
    private String linkedIn;

    @Column(name="googleplus")
    private String googleplus;


    @Column(name = "mbship_status")
    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(name = "approved")
    @Enumerated(EnumType.STRING)
    private YesNo approved;

    @Column(name = "salary")
    private BigDecimal salary;

    @Column(name = "date_created")
    @javax.persistence.Temporal(javax.persistence.TemporalType.DATE)
    private Date dateCreated;

    @ManyToOne(fetch = FetchType.LAZY)
    private User preparedBy;

    @Column(name = "date_approved")
    @javax.persistence.Temporal(javax.persistence.TemporalType.DATE)
    private Date dateApproved;

    @ManyToOne(fetch = FetchType.LAZY)
    private User approvedBy;

    @Column(name= "employed")
    private YesNo employed;

    @OneToOne
    private Bank bank;

    @OneToOne
    private Branch bankBranch;

    @Column(name = "bank_account")
    private String bankAccount;

    @Column(name = "updated")
    private YesNo updated ;

    @Column(name = "date_updated")
    @javax.persistence.Temporal(javax.persistence.TemporalType.DATE)
    private Date dateUpdated;




    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getClientNo() {
        return clientNo;
    }

    public void setClientNo(String clientNo) {
        this.clientNo = clientNo;
    }

    public Photo getMemberPhoto() {
        return memberPhoto;
    }

    public void setMemberPhoto(Photo memberPhoto) {
        this.memberPhoto = memberPhoto;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public String getGoogleplus() {
        return googleplus;
    }

    public void setGoogleplus(String googleplus) {
        this.googleplus = googleplus;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public YesNo getApproved() {
        return approved;
    }

    public void setApproved(YesNo approved) {
        this.approved = approved;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public User getPreparedBy() {
        return preparedBy;
    }

    public void setPreparedBy(User preparedBy) {
        this.preparedBy = preparedBy;
    }

    public Date getDateApproved() {
        return dateApproved;
    }

    public void setDateApproved(Date dateApproved) {
        this.dateApproved = dateApproved;
    }

    public User getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(User approvedBy) {
        this.approvedBy = approvedBy;
    }

    public YesNo getEmployed() {
        return employed;
    }

    public void setEmployed(YesNo employed) {
        this.employed = employed;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Branch getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(Branch bankBranch) {
        this.bankBranch = bankBranch;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public YesNo getUpdated() {
        return updated;
    }

    public void setUpdated(YesNo updated) {
        this.updated = updated;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }
}
