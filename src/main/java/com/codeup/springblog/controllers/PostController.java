package com.codeup.springblog.controllers;

import org.springframework.web.bind.annotation.*;

public class PostController {
    @GetMapping("/posts")
    @ResponseBody
    public String posts() {
        return "/posts/index";
    }

    @RequestMapping(path = "/posts/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String viewAd(@PathVariable long id) {
        return "/posts/view";
    }

    @RequestMapping (value = "/posts/create", method = RequestMethod.GET)
    @ResponseBody
    public String viewCreate() {
        return "/posts/create";
    }
    @PostMapping (path = "/posts/create")
    public String postCreate() {
        return null;
    }
}

