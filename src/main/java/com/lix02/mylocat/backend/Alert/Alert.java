package com.lix02.mylocat.backend.Alert;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Alert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String alertTime;
    private String status;


    public Alert () {
        // No args-constructor needed
    }

    public int getId() {
        return id;
    }

    public String getAlertTime() {
        return alertTime;
    }

    public String getStatus() {
        return status;
    }
}
