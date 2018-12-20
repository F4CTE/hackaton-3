package fr.autostopfrance.Autostop.models;

import javax.persistence.*;

@Entity
@Table(name="members")
public class Members {

    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;
    @Column(name="email")
    private String email;
private long id_members;
    @ManyToOne
//    @JoinColumn(name = "id_members")
    private User user;

    public Members ( Long id, Long id_members, String email ) {
        this.id = id;
        this.id_members = id_members;
        this.email = email;
    }



    public Members(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getId_members() {
        return id_members;
    }

    public void setId_members(Long id_members) {
        this.id_members = id_members;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
