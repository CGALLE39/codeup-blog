package com.codeup.springblog.controllers;

import org.springframework.web.bind.annotation.*;

public class PostController {
    @GetMapping("/posts")
    @ResponseBody
    public String posts() {
        return "<h1>Posts index page</h1>";
    }

    @RequestMapping(path = "/posts/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String viewAd(@PathVariable String id) {
        return String.format("Now viewing %s", id);
    }

    @RequestMapping (value = "/posts/create", method = RequestMethod.GET)
    @ResponseBody
    public String create() {
        return "<h1>Create your own ad here!</h1>";
    }
//    @RequestMapping (value = "/posts/create", method = RequestMethod.POST)
//    @ResponseBody
//    public String create() {
//        return ;
//    }
}

