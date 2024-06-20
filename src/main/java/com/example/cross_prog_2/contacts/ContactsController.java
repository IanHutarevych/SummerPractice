package com.example.cross_prog_2.contacts;

import com.example.cross_prog_2.contact.Contact;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/contacts")
public class ContactsController {

    private final ContactService contactService;

    public ContactsController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping
    public String contacts(Model model) {
        // Отримання списку всіх контактів і передача його до моделі для відображення в таблиці
        model.addAttribute("contacts", contactService.getAllContacts());
        return "contacts/contacts";
    }

    @GetMapping("/add")
    public String showAddContactForm(Model model) {
        model.addAttribute("contact", new Contact());
        return "contacts/add-contact-form";
    }

    @PostMapping("/save")
    public String saveContact(@Valid @ModelAttribute("contact") Contact contact, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "contacts/add-contact-form";
        }
        contactService.save(contact);
        return "redirect:/contacts";
    }
}
