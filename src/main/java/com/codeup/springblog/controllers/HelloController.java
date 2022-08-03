package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
    @GetMapping("/hello/{name}")
    public String hello(Model model) {
        model.addAttribute("name", "World");
        return "hello";
    }
//@RequestMapping(path = "/hello/{name}", method = RequestMethod.GET)
//    public String sayHello(@PathVariable String name, Model model) {
//    model.addAttribute("name", name);
//    return "hello";
//}
}
