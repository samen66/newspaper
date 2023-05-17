package com.github.samen66.newspaper.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity()
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String login;
    private String password;
    private String tolen;

    public User() {

    }

    public User(Integer id, String login, String password, String tolen) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.tolen = tolen;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTolen() {
        return tolen;
    }

    public void setTolen(String tolen) {
        this.tolen = tolen;
    }
}
