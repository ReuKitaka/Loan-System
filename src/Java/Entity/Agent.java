package Entity;

import javax.persistence.*;


@Entity
public class Agent extends Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "client_no", nullable = true)
    private String agentNo;
}
