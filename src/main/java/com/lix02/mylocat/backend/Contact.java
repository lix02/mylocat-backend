package com.lix02.mylocat.backend;

public class Contact {

    private String name;
    private int id;
    private int phonenumber;


    public Contact(String name, int id, int phonenumber) {
        this.name = name;
        this.id = id;
        this.phonenumber = phonenumber;
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
