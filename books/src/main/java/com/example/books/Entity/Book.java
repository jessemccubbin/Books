package com.example.books.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Book {

    String author;
    String title;
    int id;

    public Book(@JsonProperty("id") int id, @JsonProperty("title") String title , @JsonProperty("author") String author ) {
        this.author = author;
        this.title = title;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
