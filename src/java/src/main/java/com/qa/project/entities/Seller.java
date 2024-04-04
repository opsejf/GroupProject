package com.qa.project.entities;

import io.swagger.v3.oas.annotations.media.DependentRequired;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;


@Entity
@Table(name = "sellers")
public class Seller {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)

    private String lastName;

    @Column(name = "email", nullable = false)
    private String email;


    @Column(name = "telephone", nullable = false)
    private String telephone;

    // constructors
    public Seller() {
        super();
    }

    public Seller(        String firstName,
                          String lastName,
                          String email,

                          String telephone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.telephone = telephone;
    }

    public Seller(long id,
                String firstName,
                  String lastName,
                  String email,
                  String telephone) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
}
