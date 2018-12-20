package fr.autostopfrance.Autostop.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name="members")
    @OneToMany(cascade = CascadeType.ALL, targetEntity=Members.class)
    private Set<Members> members = new HashSet<>();


    protected User () {
    }

    public User (String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    //public Set<Members> getId_members() {
    //    return members;
    //}

}
