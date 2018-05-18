package Entity;

import javax.persistence.*;
import java.io.Serializable;

@NamedQueries({
        @NamedQuery(
                name = "SelectAll",
                query = "select b from Branch b "
        ),
        @NamedQuery(
                name = "SelectById",
                query = "select b from Branch b where b.code=:id"
        ),
        @NamedQuery(
                name = "SelectByName",
                query = "select b from Branch b where  b.name like lower(:bname) "
        )
})
@Entity
@Table(name = "bank_branches")
public class Branch implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private String code;

    @Column(name = "physical_location")
    private String location;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    @ManyToOne
    private Bank bank;

}
