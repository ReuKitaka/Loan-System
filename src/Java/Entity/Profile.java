package Entity;


import javax.persistence.*;

@NamedQueries({
        @NamedQuery(
                name = "SelectAllProfiles",
                query = "select p from Profile p "
        )
//        @NamedQuery(
//                name = "SelectById",
//                query = "select p from Profile p where p.code=:id"
//        ),
//        @NamedQuery(
//                name = "SelectByName",
//                query = "select p from Profile p where  b.name like lower(:bname) "
//        )
})
@Entity
@Table(name = "profiles")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "client_no", nullable = true)
    private String profileNo;

    @Column(name = "name", unique = true)
    private String name;

    @Column(name = "description")
    private String desc;

    public Profile(String name) {
        this.name = name;
    }

    public Profile() {

    }

    public String getProfileNo() {
        return profileNo;
    }

    public void setProfileNo(String profileNo) {
        this.profileNo = profileNo;
    }

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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
