package com.codeup.springblog.controllers;


import org.springframework.stereotype.Controller;

public class Post {

    private String title;

    private String body;

    public Post(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
