package com.codeup.springblog.model;



public class Post {

    private String title;

    private long id;

    private String body;

    public Post (long id, String title, String body) {
        this.body = body;
        this.id = id;
        this.title = title;
    }


public Post() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
