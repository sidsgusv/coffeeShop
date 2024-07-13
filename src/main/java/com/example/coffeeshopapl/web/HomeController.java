package com.example.coffeeshopapl.web;

import com.example.coffeeshopapl.service.OrderService;
import com.example.coffeeshopapl.service.UserService;
import com.example.coffeeshopapl.util.CurrentUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private final CurrentUser currentUser;

    private final OrderService orderService;

    private final UserService userService;

    public HomeController(CurrentUser currentUser, OrderService orderService, UserService userService) {
        this.currentUser = currentUser;
        this.orderService = orderService;
        this.userService = userService;
    }

    @GetMapping("/")
    public String index(Model model) {

        if (currentUser.getId() == null) {
            return "index";
        }
        model.addAttribute("orders",orderService.findOrderOrderByPriceDesc());
        model.addAttribute("totalTime",orderService.findOrderOrderByPriceDesc()
                .stream()
                .map(orderViewModel -> orderViewModel.getCategory().getNeededTime())
                .reduce(Integer::sum) //(a,b) - >a+b
                .orElse(null));

        model.addAttribute("users",userService.findAllUsersAndCountOfOrdersDesc());

        return "home";

    }
}
