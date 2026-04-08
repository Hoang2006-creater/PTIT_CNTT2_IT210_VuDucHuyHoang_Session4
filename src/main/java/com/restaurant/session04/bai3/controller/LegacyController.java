package com.restaurant.session04.bai3.controller;

import com.restaurant.session04.bai3.service.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bai3")
public class LegacyController {
    //Em chọn Cách A (/bai3/orders/5 với @PathVariable) vì số 5 nằm trong URI Path, đại diện trực tiếp cho tài nguyên cụ thể là một đơn hàng.
    // Theo nguyên tắc RESTful, khi truy cập chi tiết một đối tượng bằng ID thì nên đặt ID trong đường dẫn để thể hiện rõ ý nghĩa tài nguyên.
    // Trong khi đó, @RequestParam thường dùng cho các tham số tùy chọn như lọc, tìm kiếm hoặc phân trang.
    // Vì vậy, sử dụng @PathVariable trong trường hợp này là phù hợp và đúng chuẩn hơn.
    private final OrderService orderService;

    public LegacyController(OrderService orderService) {
        this.orderService = orderService;
    }
    @GetMapping("/orders")
    public String getAllOrders(){
        return orderService.getAllOrders();
    }
    @GetMapping("/orders/{id}")
    public String getOrderById(@PathVariable("id") Long id) {
        return "Chi tiết đơn hàng số " + id;
    }
    @GetMapping("/menu")
    public String getMenu(
            @RequestParam(value = "category", defaultValue = "chay") String category
    ){
        return "menu loại: " + category;
    }
}
