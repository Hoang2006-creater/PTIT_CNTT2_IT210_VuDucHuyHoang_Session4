package com.restaurant.session04.session05.repository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class OrderRepository {
    private final Map<Long, String> orders = new HashMap<>();

    public String findById(Long id) {
        return orders.get(id);
    }

    public void save(Long id, String order) {
        orders.put(id, order);
    }

    public void delete(Long id) {
        orders.remove(id);
    }

    public boolean exists(Long id) {
        return orders.containsKey(id);
    }
}
