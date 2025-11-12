package com.amazonLike.UserService.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user/test")
public class TestController {

    @GetMapping
    ResponseEntity<Map<String, String>> test(){
        System.out.println("DEi punda");
        Map<String, String> response = new HashMap<>();
        response.put("name", "Dei Punda");
        response.put("status", "success");
        return ResponseEntity.ok( response);
    }
}