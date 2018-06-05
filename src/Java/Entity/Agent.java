package Entity;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "agents")
public class Agent extends Person implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "client_no", nullable = true)
    private String agentNo;
}
