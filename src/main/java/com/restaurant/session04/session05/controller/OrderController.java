package com.restaurant.session04.session05.controller;
import com.restaurant.session04.session05.service.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bai5/orders")
public class OrderController {
    //Client (Browser/Postman)
    //        ↓
    //Controller (@Controller)
    //- Nhận request (URL, method)
    //- Validate cơ bản
    //        ↓
    //Service (@Service)
    //- Xử lý logic nghiệp vụ
    //- Kiểm tra tồn tại đơn hàng
    //        ↓
    //Repository (@Repository)
    //- Giả lập lưu trữ (List/Map)
    //- CRUD dữ liệu
    //        ↓
    //Response trả về Client
    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    // Xem đơn hàng
    @GetMapping("/{id}")
    public String getOrder(@PathVariable("id") Long id) {
        return service.getOrder(id);
    }

    // Tạo đơn hàng
    @PostMapping("/{id}")
    public String createOrder(@PathVariable("id") Long id) {
        return service.createOrder(id);
    }

    // Hủy đơn hàng
    @DeleteMapping("/{id}")
    public String deleteOrder(@PathVariable("id") Long id) {
        return service.deleteOrder(id);
    }

    // Xử lý lỗi ép kiểu
    @ExceptionHandler(NumberFormatException.class)
    public String handleNumberFormat() {
        return "ID đơn hàng phải là một số";
    }

    @ExceptionHandler(Exception.class)
    public String handleGeneral() {
        return "Có lỗi xảy ra, vui lòng thử lại";
    }
}