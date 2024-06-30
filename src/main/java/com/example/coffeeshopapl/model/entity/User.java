package com.example.coffeeshopapl.model.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "users")
public class User extends BaseEntity {

    //•	Has a Username (unique)
    //o	The length of the username must be between 5 and 20 characters (both numbers are INCLUSIVE).
    //•	Has a First Name
    //o	Can be null.
    //•	Has a Last Name
    //o	The length of the last name must be between 5 and 20 characters (both numbers are INCLUSIVE).

    //•	Has a Password
    //o	The length of the password must be more than 3 (INCLUSIVE).
    //•	Has an Email
    //o	Must contain a '@' symbol.
    //o	The email must be unique.

    private String username;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private Set<Order> orders;


    public User() {
    }

    @Column(unique = true, nullable = false)
    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    @Column
    public String getFirstName() {
        return firstName;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Column(nullable = false)
    public String getLastName() {
        return lastName;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Column(nullable = false)
    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    @Column(unique = true, nullable = false)
    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }
@OneToMany(mappedBy = "employee",fetch = FetchType.EAGER)
    public Set<Order> getOrders() {
        return orders;
    }

    public User setOrders(Set<Order> orders) {
        this.orders = orders;
        return this;
    }
}
