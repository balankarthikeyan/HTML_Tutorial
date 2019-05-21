package com.skavaadminjava.thymeleaf3.model;

import java.io.Serializable;

public class Wordings implements Serializable {
    private static final long serialVersionUID = 1L;

    String key;
    String value;

    public Wordings(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}