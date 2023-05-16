package com.github.samen66.newspaper.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity()
@Table(name = "users")
@Data
@AllArgsConstructor
public class User {
    @Id
    @Column(name = "id")
    private Integer id;
    private String login;
    private String password;
    private String tolen;

    public User() {

    }
}
