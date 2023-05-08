package com.wisercat.petManagement.models;

import javax.persistence.*;

@Entity
public class PetOwner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    @OneToMany
    private String name;
    private String password;

    public PetOwner(String username,String name, String password) {
        this.username = username;
        this.password = password;
        this.name = name;
    }

    public PetOwner() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
