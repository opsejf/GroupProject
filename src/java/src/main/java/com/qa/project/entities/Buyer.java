package com.qa.project.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Buyer {

    @Id
    @GeneratedValue
    Integer id;

    @Column(name = "first_name", nullable = false)
    String first_name;

    @Column(name = "last_name", nullable = false)
    String last_name;

    @Column(name = "email", nullable = false)
    String email;

    @Column(name = "telephone", nullable = false)
    String telephone;




    public Buyer(Integer id, String first_name, String last_name, String email, String telephone){
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.telephone = telephone;
    }

    public Buyer(String first_name, String last_name, String email, String telephone){
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.telephone = telephone;
    }
    public Buyer(){}

//    public Integer getId(){
//        return id;
//    }
    public String getFirstName(){
        return first_name;
    }
    public void setFirstName(String first_name){
        this.first_name = first_name;
    }
    public String getLastName(){
        return last_name;
    }
    public void setLastName(String last_name){
        this.last_name = last_name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getTelephone(){
        return telephone;
    }
    public void setTelephone(String telephone){
        this.telephone = telephone;
    }
}
