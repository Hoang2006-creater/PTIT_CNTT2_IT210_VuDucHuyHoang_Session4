package com.restaurant.session4.repository;

import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {
    public String getAllOrders() {
        return "Danh sach toan bo don hang";
    }
    public String getOrderById(long id) {
        return "Danh sach toan bo don hang"+id;
    }
}
