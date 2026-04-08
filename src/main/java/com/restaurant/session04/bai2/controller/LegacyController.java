package com.restaurant.session04.bai2.controller;

import com.restaurant.session04.bai2.service.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bai2")
public class LegacyController {
    private final OrderService orderService;

    public LegacyController(OrderService orderService) {
        this.orderService = orderService;
    }
    @GetMapping("/orders")
    public String getAllOrders(){
        return orderService.getAllOrders();
    }
    @GetMapping("/orders/{id}")
    public String getOrderById(@PathVariable Long id){
        return orderService.getOrderById(id);
    }
    @GetMapping("/menu")
    public String getMenu(
            @RequestParam(value = "category", defaultValue = "chay") String category
    ){
        return "menu loại: " + category;
    }
}
