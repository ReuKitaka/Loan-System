package Entity;


import Entity.Enums.Gender;
import Entity.Enums.IdType;
import Entity.Enums.MaritalStatus;
import Entity.Enums.Title;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
public class Person implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "title")
    @Enumerated(EnumType.STRING)
    private Title title;

    @Column(name = "surname")
    @org.hibernate.annotations.Index(name="mbsidx")
    private String surname;

    @Column(name = "firstname")
    @org.hibernate.annotations.Index(name="mbfidx")
    private String firstname;

    @Column(name = "other_names")
    @org.hibernate.annotations.Index(name="mbondx")
    private String othernames;

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "dob")
    @Temporal(TemporalType.DATE)
    private Date dob;

    @Column(name = "id_type")
    @Enumerated(EnumType.STRING)
    private IdType idType;

    @Column(name = "id_no", nullable = true)
    private String idNo;


    @Column(name = "martl_status")
    private MaritalStatus maritalStatus;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getOthernames() {
        return othernames;
    }

    public void setOthernames(String othernames) {
        this.othernames = othernames;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public IdType getIdType() {
        return idType;
    }

    public void setIdType(IdType idType) {
        this.idType = idType;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", title=" + title +
                ", surname='" + surname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", othernames='" + othernames + '\'' +
                ", gender=" + gender +
                ", dob=" + dob +
                ", idType=" + idType +
                ", idNo='" + idNo + '\'' +
                ", maritalStatus=" + maritalStatus +
                '}';
    }


}
