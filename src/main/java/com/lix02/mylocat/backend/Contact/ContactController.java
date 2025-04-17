package com.lix02.mylocat.backend.Contact;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @GetMapping("/contacts")
    public List<Contact> getContacts() {

        return contactRepository.findAll();
    }

    @PostMapping("/contacts")
    public Contact addContact(@RequestBody Contact contact) {

        return contactRepository.save(contact);
    }

    @DeleteMapping("/contacts/{id}")
    public String deleteContact(@PathVariable int id) {
        if (contactRepository.existsById(id)) {
            contactRepository.deleteById(id);
            return "Contact with ID " + id + " deleted.";
        } else {
            return "Contact with ID " + id + " not found.";
        }
    }



}
