package com.example.coffeeshopapl.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
public class Order extends BaseEntity {


    //•	Has a Name
    //o	The length of the name must be between 3 and 20 characters (both numbers are INCLUSIVE).
    //•	Has a Price
    //o	The price must be a positive number
    //•	Has an Order time
    //o	The date and time that cannot be in the future
    //•	Has a Category
    //o	Has ONLY ONE category
    //o	This is the relation with categories.
    //•	Has a Description
    //o	The length of the description must be at least 5 (INCLUSIVE) characters
    //o	The description is a long text field.
    //•	Has a Employee (user)
    //o	A user that adds this order to the Coffee Shop application


    private String name;
    private BigDecimal price;
    private LocalDateTime orderTime;
    private Category category;
    private String description;

    private User employee;

    public Order() {
    }

    @Column(unique = true, nullable = false)
    public String getName() {
        return name;
    }

    public Order setName(String name) {
        this.name = name;
        return this;
    }

    @Column(nullable = false)
    public BigDecimal getPrice() {
        return price;
    }

    public Order setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    @Column(nullable = false)
    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public Order setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
        return this;
    }

    @ManyToOne
    public Category getCategory() {
        return category;
    }

    public Order setCategory(Category category) {
        this.category = category;
        return this;
    }

    @Column(nullable = false)
    public String getDescription() {
        return description;
    }

    public Order setDescription(String description) {
        this.description = description;
        return this;
    }

    @ManyToOne
    public User getEmployee() {
        return employee;
    }

    public Order setEmployee(User employee) {
        this.employee = employee;
        return this;
    }
}
