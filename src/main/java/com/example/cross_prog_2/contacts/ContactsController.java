package com.example.cross_prog_2.contacts;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contacts")
public class ContactsController {

    @GetMapping
    public String contacts(Model model) {
        return "contacts/contacts";
    }
}
