package com.example.coffeeshopapl.service;


import com.example.coffeeshopapl.model.entity.User;
import com.example.coffeeshopapl.model.service.UserServiceModel;
import com.example.coffeeshopapl.model.view.UserViewModel;

import java.util.List;

public interface UserService {
  void registerUser(UserServiceModel userServiceModel);

    UserServiceModel findByUsernameAndPassword(String username, String password);

    void loginUser(Long id, String username);

    User findById(Long id);

    List<UserViewModel> findAllUsersAndCountOfOrdersDesc();
}
