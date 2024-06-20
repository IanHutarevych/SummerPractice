package com.example.cross_prog_2.contacts;

import com.example.cross_prog_2.contact.Contact;

import java.util.List;

public interface ContactService {
    void save(Contact contact);
    List<Contact> getAllContacts();
}
