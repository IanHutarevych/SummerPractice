package com.example.cross_prog_2.contact;

import io.github.wimdeblauwe.jpearl.AbstractEntity;

import jakarta.persistence.Entity;

import jakarta.persistence.Table;

@Entity
@Table(name="tt_contacts")
public class Contact extends AbstractEntity<ContactId> {



    /**
     * Default constructor for JPA
     */
    private Name name;
    private Phone phone;
    private int age;

    public Contact() {
    }

    public Contact(ContactId id, Name name, Phone phone, int age) {
        super(id);
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(ContactId contactId) {
    }
}