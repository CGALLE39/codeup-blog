package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DiceRedirect {
    @GetMapping("/roll-dice")
    public String roll() {
        return "roll-dice";
    }
}
