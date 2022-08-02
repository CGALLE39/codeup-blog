package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "<h1>Hello From Spring!</h1>";
    }

    @RequestMapping(path = "/hello/{name}", method = RequestMethod.GET)
    @ResponseBody
    public String helloBuddy(@PathVariable String name) {
        return String.format("Ayo, %s!", name);
    }

}
