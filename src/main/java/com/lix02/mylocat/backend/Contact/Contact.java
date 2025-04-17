package com.lix02.mylocat.backend.Contact;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int phonenumber;


    public Contact() {
        // No arg-constructor needed
    }



    public String getName() {
        return name;

    }

    public int getId() {
        return id;

    }

    public int getPhonenumber() {
        return phonenumber;

    }
}
