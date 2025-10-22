package com.amazonLike.UserService.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/test")
public class TestController {

    @GetMapping
    String test(){
        return "User Service is up and running!";
    }
}
