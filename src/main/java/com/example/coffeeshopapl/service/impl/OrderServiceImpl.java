package com.example.coffeeshopapl.service.impl;

import com.example.coffeeshopapl.model.service.OrderServiceModel;
import com.example.coffeeshopapl.model.view.OrderViewModel;
import com.example.coffeeshopapl.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public void addOrder(OrderServiceModel orderServiceModel) {

    }

    @Override
    public List<OrderViewModel> findOrderOrderByPriceDesc() {
        return null;
    }

    @Override
    public void readyOrder(Long id) {

    }
}
