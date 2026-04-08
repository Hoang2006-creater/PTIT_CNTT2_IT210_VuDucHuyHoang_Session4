package com.restaurant.session04.bai3.service;

import com.restaurant.session04.bai3.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    public String getAllOrders(){
        return orderRepository.getAllOrders();
    }
    public String getOrderById(Long id){
        return orderRepository.getOrderById(id);
    }
}
