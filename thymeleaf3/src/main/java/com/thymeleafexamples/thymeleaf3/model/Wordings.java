package com.thymeleafexamples.thymeleaf3.model;

import java.io.Serializable;

public class Wordings implements Serializable {
    private static final long serialVersionUID = 1L;

    String title;
    String description;

    public Wordings(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}