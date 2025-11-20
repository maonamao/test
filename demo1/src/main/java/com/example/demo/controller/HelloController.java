package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class HelloController {

    @RestController
    public class HelloContrller {

        // 2. 使用@GetMapping注解，声明这是一个GET请求
        @GetMapping("/hello")
        public String hello() {
            return "Hello Spring Boot!";
        }

    }
}
