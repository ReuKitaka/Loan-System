package Entity;

import Entity.Enums.Status;
import Entity.Enums.YesNo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@NamedQueries({
        @NamedQuery(
                name = "SelectAll",
                query = "select u from User u "
        ),
//        @NamedQuery(
//                name = "SelectById",
//                query = "select u from User u where u.username=:uName"
//        ),
        @NamedQuery(
                name = "SelectByName",
                query = "select u from User u where u.username like lower (:uName)"
        )
})
@Entity
@Table(name = "users")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "firstname")
    private String surname;

    @Column(name = "othernames")
    private String othernames;

    @Column(name = "username", unique = true)
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "last_login")
    @javax.persistence.Temporal(javax.persistence.TemporalType.DATE)
    private Date lastLogin;

    @Column(name = "email")
    private String email;

    @Column(name = "mobile_number")
    private String mobileNumber;

    @ManyToOne
    private Profile profile;

    @Column(name = "superAdmin", nullable = true)
    private String isUserSuper;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(name = "date_status_changed")
    @javax.persistence.Temporal(javax.persistence.TemporalType.DATE)
    private Date dateStatusChanged;

    @Column(name = "admin")
    @Enumerated(EnumType.STRING)
    private YesNo admin;

    @Column(name = "force_chg_pwd")
    @Enumerated(EnumType.STRING)
    private YesNo changePassword;

    @Column(name = "retry_count")
    private int retryLoginCount;

    @Column(name = "last_chng_date")
    @javax.persistence.Temporal(javax.persistence.TemporalType.DATE)
    private Date lastPwdChngDate;

    @Transient
    private boolean authentic;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getOthernames() {
        return othernames;
    }

    public void setOthernames(String othernames) {
        this.othernames = othernames;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String getIsUserSuper() {
        return isUserSuper;
    }

    public void setIsUserSuper(String isUserSuper) {
        this.isUserSuper = isUserSuper;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getDateStatusChanged() {
        return dateStatusChanged;
    }

    public void setDateStatusChanged(Date dateStatusChanged) {
        this.dateStatusChanged = dateStatusChanged;
    }

    public YesNo getAdmin() {
        return admin;
    }

    public void setAdmin(YesNo admin) {
        this.admin = admin;
    }

    public YesNo getChangePassword() {
        return changePassword;
    }

    public void setChangePassword(YesNo changePassword) {
        this.changePassword = changePassword;
    }

    public int getRetryLoginCount() {
        return retryLoginCount;
    }

    public void setRetryLoginCount(int retryLoginCount) {
        this.retryLoginCount = retryLoginCount;
    }

    public Date getLastPwdChngDate() {
        return lastPwdChngDate;
    }

    public void setLastPwdChngDate(Date lastPwdChngDate) {
        this.lastPwdChngDate = lastPwdChngDate;
    }

    public boolean isAuthentic() {
        return authentic;
    }

    public void setAuthentic(boolean authentic) {
        this.authentic = authentic;
    }
}
