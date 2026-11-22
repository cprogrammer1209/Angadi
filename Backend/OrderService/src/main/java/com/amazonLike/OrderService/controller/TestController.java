package com.amazonLike.OrderService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order/test")
public class TestController {
    @GetMapping
    String test(){
        System.out.println("Order Service Test Endpoint Hit");
        return "Order Service is up and running!";
    }
}
