package com.example.cross_prog_2.contact;

import jakarta.persistence.Embeddable;

@Embeddable
public class Phone {
    private String phone;

    public Phone() {

    }

    public Phone (String phone) {
        this.phone = phone;
    }

    public String getFirstName() {
        return phone;
    }
}
