package com.example.cross_prog_2.contacts;

import com.example.cross_prog_2.contact.Contact;
import com.example.cross_prog_2.contact.ContactId;
import com.example.cross_prog_2.contact.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Autowired
    public ContactServiceImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public void save(Contact contact) {
        if (contact.getId() == null) {
            contact.setId(new ContactId(UUID.randomUUID()));
        }
        contactRepository.save(contact);
    }

    @Override
    public List<Contact> getAllContacts() {
        List<Contact> contacts = new ArrayList<>();
        contactRepository.findAll().forEach(contacts::add);
        return contacts;
    }

}
