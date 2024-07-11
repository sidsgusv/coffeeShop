package com.example.coffeeshopapl.model.view;

public class UserViewModel {
    private String username;
    private Integer cuntOfOrders;

    public UserViewModel() {
    }

    public String getUsername() {
        return username;
    }

    public UserViewModel setUsername(String username) {
        this.username = username;
        return this;
    }

    public Integer getCuntOfOrders() {
        return cuntOfOrders;
    }

    public UserViewModel setCuntOfOrders(Integer cuntOfOrders) {
        this.cuntOfOrders = cuntOfOrders;
        return this;
    }
}
