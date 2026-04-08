package com.restaurant.session04.session05.service;

import com.restaurant.session04.session05.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public String getOrder(Long id) {
        if (!repository.exists(id)) {
            return "Không tìm thấy đơn hàng";
        }
        return "Chi tiết đơn: " + repository.findById(id);
    }

    public String createOrder(Long id) {
        repository.save(id, "Đơn hàng #" + id);
        return "Tạo đơn hàng thành công: " + id;
    }

    public String deleteOrder(Long id) {
        if (!repository.exists(id)) {
            return "Đơn hàng đã bị xóa trước đó hoặc không tồn tại";
        }
        repository.delete(id);
        return "Đã xóa đơn hàng: " + id;
    }
}