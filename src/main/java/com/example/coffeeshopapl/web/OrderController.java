package com.example.coffeeshopapl.web;


import com.example.coffeeshopapl.model.binding.OrderAddBindingModel;
import com.example.coffeeshopapl.model.service.OrderServiceModel;
import com.example.coffeeshopapl.service.OrderService;
import com.example.coffeeshopapl.util.CurrentUser;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;
    private final ModelMapper modelMapper;
    private final CurrentUser currentUser;

    public OrderController(OrderService orderService, ModelMapper modelMapper, CurrentUser currentUser) {
        this.orderService = orderService;
        this.modelMapper = modelMapper;
        this.currentUser = currentUser;
    }


    @GetMapping("/add")
    public String add(Model model) {
        if(currentUser.getId()==null){
            return "index";
        }

        return "order-add";
    }

    @PostMapping("/add")
    public String addConform(@Valid OrderAddBindingModel orderAddBindingModel,
                             BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("orderAddBindingModel", orderAddBindingModel);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.orderAddBindingModel", bindingResult);
            return "redirect:add";
        }

        orderService.addOrder(modelMapper
                .map(orderAddBindingModel, OrderServiceModel.class));
        return "redirect:/";
    }

    @GetMapping("/ready/{id}")
    public String ready (@PathVariable Long id){
        orderService.readyOrder(id);
        return "redirect:/";
    }

    @ModelAttribute
    public OrderAddBindingModel orderAddBindingModel() {
        return new OrderAddBindingModel();
    }


}
