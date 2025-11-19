package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ZooController {
@GetMapping("/zoo")
    public String getZoo() {
        return "Zoo";
    }

}

