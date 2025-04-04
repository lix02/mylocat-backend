package com.lix02.mylocat.backend;
import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.*;

@RestController
public class ContactController {

    private List<Contact> contacts = new ArrayList<>();

    @GetMapping("/contacts")
    public List<Contact> getContacts() {
        return contacts;
    }

    @PostMapping("/contacts")
    public String addContact(@RequestBody Contact contact) {
        contacts.add(contact);
        System.out.println("Received contact:" + contact.getName());
        return "Contact added successfully";
    }

    @DeleteMapping("/contacts/{id}")
    public String deleteContact(@PathVariable int id) {
        boolean removed = contacts.removeIf(contact -> contact.getId() == id);

        if (removed) {
            return "Contact with ID" + id + " deleted.";
        } else {
            return "No contact found with ID" + id;
        }
    }



}
