package com.playground.spring_security_core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String index() {
        return "index";
    }

    @GetMapping("/home/user")
    public String userHome() {
        return "user";
    }

}
