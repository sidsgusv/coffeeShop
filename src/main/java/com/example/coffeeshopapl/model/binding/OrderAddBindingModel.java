package com.example.coffeeshopapl.model.binding;


import com.example.coffeeshopapl.model.entity.CategoryNameEnum;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderAddBindingModel {

    //•	Has a Price
    //o	The price must be a positive number
    //•	Has an Order time
    //o	The date and time that cannot be in the future

    //•	Has a Description
    //o	The length of the description must be at least 5 (INCLUSIVE) characters
    //o	The description is a long text field.
    private String name;
    private BigDecimal price;
    private LocalDateTime orderTime;
    private CategoryNameEnum category;
    private String description;

    public OrderAddBindingModel() {
    }

    @Size(min = 5, max = 20, message = "Name must be between 5 and 20 characters")
    public String getName() {
        return name;
    }

    public OrderAddBindingModel setName(String name) {
        this.name = name;
        return this;
    }

    @Positive(message = "The price must be positive")
    @NotNull
    public BigDecimal getPrice() {
        return price;
    }

    public OrderAddBindingModel setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    @PastOrPresent(message = "Order time can not be in the future")
    @DateTimeFormat(pattern = "yyy-MM-dd'T'HH:mm")
    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public OrderAddBindingModel setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
        return this;
    }

    @NotNull(message = "You must select a category")
    public CategoryNameEnum getCategory() {
        return category;
    }

    public OrderAddBindingModel setCategory(CategoryNameEnum category) {
        this.category = category;
        return this;
    }

    @Size(min = 5, message = "The length of the description must be at least 5 characters")
    public String getDescription() {
        return description;
    }

    public OrderAddBindingModel setDescription(String description) {
        this.description = description;
        return this;
    }
}
