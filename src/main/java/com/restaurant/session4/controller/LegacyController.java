package com.restaurant.session4.controller;

import com.restaurant.session4.service.OrderService;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bai1/orders")
public class LegacyController {
    private final OrderService orderService;

    public LegacyController(OrderService orderService) {
        this.orderService = orderService;
    }
    // Lấy tất cả
    @GetMapping
    public String getAllOrders(){
        return orderService.getAllOrders();
    }
    // Lấy theo id
    @GetMapping("/{id}")
    public String getOrderById(@PathVariable Long id){
        return orderService.getOrderById(id);
    }
}
