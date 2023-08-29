package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Book {

    private String title;
    private String author;

    @Autowired
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @PostConstruct
    public void initialize() {
        System.out.println("Initializing Book: " + title);
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("Cleaning up Book: " + title);
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
}
