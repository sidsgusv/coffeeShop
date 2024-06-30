package com.example.coffeeshopapl.model.binding;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserRegisterBindingModel {


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
    private String confirmPassword;
    private String email;

    public UserRegisterBindingModel() {
    }

    @Size(min = 5, max = 20, message = "The length of the username must be between 5 and 20 characters")
    public String getUsername() {
        return username;
    }

    public UserRegisterBindingModel setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserRegisterBindingModel setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Size(min = 5, max = 20, message = "The length of the lastname must be between 5 and 20 characters")
    public String getLastName() {
        return lastName;
    }

    public UserRegisterBindingModel setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Size(min = 3, message = "The length of the password must be more than 3")
    public String getPassword() {
        return password;
    }

    public UserRegisterBindingModel setPassword(String password) {
        this.password = password;
        return this;
    }

    @Size(min = 3, message = "The length of the password must be more than 3")
    public String getConfirmPassword() {
        return confirmPassword;
    }

    public UserRegisterBindingModel setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        return this;
    }

    @Email
    @NotBlank(message = "Email must not be empty")
    public String getEmail() {
        return email;
    }

    public UserRegisterBindingModel setEmail(String email) {
        this.email = email;
        return this;
    }
}
