package com.codeup.springblog.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
    @GetMapping("/home")
    public String welcome() {
        return "home";
    }
}
