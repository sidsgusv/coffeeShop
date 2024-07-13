package com.example.coffeeshopapl.service.impl;

import com.example.coffeeshopapl.model.entity.Order;
import com.example.coffeeshopapl.model.service.OrderServiceModel;
import com.example.coffeeshopapl.model.view.OrderViewModel;
import com.example.coffeeshopapl.repository.OrderRepository;
import com.example.coffeeshopapl.service.CategoryService;
import com.example.coffeeshopapl.service.OrderService;
import com.example.coffeeshopapl.service.UserService;
import com.example.coffeeshopapl.util.CurrentUser;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
    private final ModelMapper modelMapper;
    private final OrderRepository orderRepository;
    private final CategoryService categoryService;
    private final CurrentUser currentUser;
    private final UserService userService;

    public OrderServiceImpl(ModelMapper modelMapper, OrderRepository orderRepository, CategoryService categoryService, CurrentUser currentUser, UserService userService) {
        this.modelMapper = modelMapper;
        this.orderRepository = orderRepository;
        this.categoryService = categoryService;
        this.currentUser = currentUser;
        this.userService = userService;
    }

    @Override
    public void addOrder(OrderServiceModel orderServiceModel) {
        Order order=modelMapper
                .map(orderServiceModel, Order.class);
        order.setEmployee(userService.findById(currentUser.getId()));
        order.setCategory(categoryService.findByCategoryNameEnum(orderServiceModel.getCategory()));
    }

    @Override
    public List<OrderViewModel> findOrderOrderByPriceDesc() {
        return null;
    }

    @Override
    public void readyOrder(Long id) {

    }
}
