package com.codeup.springblog.controllers;

import com.codeup.springblog.model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {
    @GetMapping("/posts")
   public String all(Model model) {
        List<Post> posts = new ArrayList<>();
        posts.add(new Post(1, "post1", "post1"));
        posts.add(new Post(2, "post2", "post2"));
        posts.add(new Post(3, "post3", "post3"));
        model.addAttribute("posts", posts);
        return "/posts/index";
    }

    @GetMapping("/posts/{id}")
    public String postByIdPage(@PathVariable long id, Model model){
        List<Post> posts = new ArrayList<>();
        posts.add(new Post(1L, "Post 1", "This is my post 1"));
        posts.add(new Post(2L, "Post 2", "This is my post 2"));
        posts.add(new Post(3L, "Post 3", "This is my post 3"));

        model.addAttribute("post", posts.get((int)id - 1));

        return "/posts/show";
    }

}

