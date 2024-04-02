package com.qa.project.entities;

import io.swagger.v3.oas.annotations.media.DependentRequired;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;


@Entity
//@Table(name = "sellers")
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
    private long id;

    @Column(name = "firstName", nullable = false)
    private String firstName;

    @Column(name = "lastName", nullable = false)

    private String lastName;

    @Column(name = "address", nullable = false, unique = true)
    private String address;

    @Column(name = "postcode", nullable = false, unique = true)
    private String postCode;

    @Column(name = "telephone", nullable = false, unique = true)
    private String telephone;

    @Column(name = "password", nullable = false, unique = false)
    private String password;

    // constructors
    public Seller() {
        super();
    }

    public Seller(        String firstName,
                          String lastName,
                          String address,
                          String postCode,
                          String telephone,
                          String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.postCode = postCode;
        this.telephone = telephone;
        this.password = password;
    }

    public Seller(long id,
                String firstName,
                  String lastName,
                  String address,
                  String postCode,
                  String telephone,
                  String password) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.postCode = postCode;
        this.telephone = telephone;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthentication(String email, String password) {
        this.password = password;
        return "testToken123";
    }
}
