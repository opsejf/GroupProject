package com.qa.project.entities;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
public class Buyer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name", nullable = false)
    private String first_name;

    @Column(name = "last_name", nullable = false)
    private String last_name;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "telephone", nullable = false)
    private String telephone;

//    @Column(name = "properties", nullable = false)
//    private ArrayList<Integer> properties;

//    public Buyer(Integer id, String first_name, String last_name, String email, String telephone){
//        this.id = id;
//        this.first_name = first_name;
//        this.last_name = last_name;
//        this.email = email;
//        this.telephone = telephone;
//    }

    public Buyer(String first_name, String last_name, String email, String telephone){
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.telephone = telephone;
        //this.properties = properties;
    }
    public Buyer(){}

    public long getId(){
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }

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

   // public ArrayList<Integer> getProperties(){
   //     return properties;
  //  }

   // public void setProperties(ArrayList<Integer> properties){
    //    this.properties = properties;
   // }

}
