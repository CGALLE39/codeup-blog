package com.codeup.springblog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {

    @RequestMapping(path = "/add/{num}/and/{num2}", method = RequestMethod.GET)
    @ResponseBody
    public String addEm(@PathVariable int num, @PathVariable  int num2) {
        return  "The sum is " + (num + num2) + "!";
    }

    /// OR
    @RequestMapping(path = "/add/{num}/and/{num2}", method = RequestMethod.GET)
    @ResponseBody
    public String addFormat(@PathVariable int num, @PathVariable  int num2) {
        return  String.format("d% + d% = d%", num, num2, num + num2);
    }



    @RequestMapping(path = "/subtract/{num}/and/{num2}", method = RequestMethod.GET)
    @ResponseBody
    public String subtractEm(@PathVariable int num, @PathVariable int num2) {
        return "The difference is " + (num - num2) + "!";
    }

    @RequestMapping(path = "/multiply/{num}/and/{num2}", method = RequestMethod.GET)
    @ResponseBody
    public String multiplyEm(@PathVariable int num, @PathVariable int num2) {
        return "The product is " + (num * num2) + "!";
    }

    @RequestMapping(path = "/divide/{num}/from/{num2}", method = RequestMethod.GET)
    @ResponseBody
    public String divideEm(@PathVariable int num, int num2) {
        return "The remainder is " + (num / num2) + "!";
    }
}