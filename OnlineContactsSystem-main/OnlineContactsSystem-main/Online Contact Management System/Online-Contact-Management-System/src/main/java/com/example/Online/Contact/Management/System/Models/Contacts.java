package com.example.Online.Contact.Management.System.Models;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Contacts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_Id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("phono")
    private String phono;

    @JsonProperty("email")
    private String email;

    public Contacts() {
    }

    public Contacts(Long user_Id, String name, String phono, String email) {
        this.user_Id = user_Id;
        this.name = name;
        this.phono = phono;
        this.email = email;
    }


    public Long getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(Long user_Id) {
        this.user_Id = user_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhono() {
        return phono;
    }

    public void setPhono(String phono) {
        this.phono = phono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}
