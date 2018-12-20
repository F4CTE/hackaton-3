package fr.autostopfrance.Autostop.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="members")
public class Members {

    @Id
    @GeneratedValue
    @Column
    private Long id;
    @Column
    private String email;
    @Column
    private Long id_members;

    public Members ( Long id, Long id_members, String email ) {
        this.id = id;
        this.id_members = id_members;
        this.email = email;
    }



    public Members(){}

    public Members(int i, String s, String email){}

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
