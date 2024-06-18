package com.example.cross_prog_2.contact;

import jakarta.persistence.Embeddable;

@Embeddable
public class Name {
    private String name;

    public Name() {

    }

    public Name (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
