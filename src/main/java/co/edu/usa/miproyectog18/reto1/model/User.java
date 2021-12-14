package co.edu.usa.miproyectog18.reto1.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="email", nullable=false, length=50, unique=true)
    private String email;
    @Column(name="password", nullable=false, length=80)
    private String password;
    @Column(name="name", nullable=false, length=80)
    private String name;

/**
    public User(Integer id, String email, String name, String password){
        this.id = id;
        this.email = email;
        this.name = name;
        this.password = password;
    }
*/
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
