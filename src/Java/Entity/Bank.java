package Entity;

import Entity.Enums.PayPointType;
import Entity.Enums.Status;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "banks")
public class Bank implements Serializable{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "code", unique = true)
    private String code;

    @Column(name = "swift_code", unique = true)
    private String swiftCode;

    @Column(name = "paypoint_type")
    @Enumerated(EnumType.STRING)
    private PayPointType payPointType;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne
    private Regime regime;


}
