package com.restaurant.session04.bai4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {
    //URL (Client gửi request)
    //   xuống
    ///bai4/products?category=chay&limit=10
    //
    //   xuống (Controller nhận)
    //@RequestParam("category") → category
    //@RequestParam("limit") → limit
    //
    //   xuống (Đưa vào ModelMap)
    //key: "category" → value: chay
    //key: "limit" → value: 10
    //key: "message" → value: "Tìm kiếm thành công"
    //
    //   xuống (Trả về View)
    //View name: "productList"
    //
    //   xuống (JSP hiển thị)
    @GetMapping("/bai4/products")
    public String getProducts(
            @RequestParam("category")String category,
            @RequestParam("limit") int limit,
            ModelMap model
    ) {
        model.addAttribute("category", category)
                .addAttribute("limit", limit)
                .addAttribute("message", "Tìm kiếm thành công");

        return "productList";
    }
}