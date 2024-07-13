package com.example.coffeeshopapl.service;


import com.example.coffeeshopapl.model.service.OrderServiceModel;
import com.example.coffeeshopapl.model.view.OrderViewModel;

import java.util.List;

public interface OrderService {
    void addOrder(OrderServiceModel orderServiceModel);

    List<OrderViewModel> findOrderOrderByPriceDesc();

    void readyOrder(Long id);
}
