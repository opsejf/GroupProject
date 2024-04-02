package com.qa.project.entities;

import io.swagger.v3.oas.annotations.media.DependentRequired;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;


@Entity
@Table(name = "sellers")
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seller_id")
    private long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)

    private String lastName;

    @Column(name = "address", nullable = false, unique = true)
    private String address;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "postcode", nullable = false, unique = true)
    private String postCode;

    @Column(name = "telephone", nullable = false, unique = true)
    private String telephone;

    // constructors
    public Seller() {
        super();
    }

    public Seller(        String firstName,
                          String lastName,
                          String email,
                          String address,
                          String postCode,
                          String telephone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.postCode = postCode;
        this.telephone = telephone;
    }

    public Seller(Long id,
                String firstName,
                  String lastName,
                  String email,
                  String address,
                  String postCode,
                  String telephone) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.postCode = postCode;
        this.telephone = telephone;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
