package com.lix02.mylocat.backend.Alert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlertController {

    @Autowired
    private AlertRepository alertRepository;

    @GetMapping("/alerts")
    public List<Alert> getAlerts() {
        return alertRepository.findAll();
    }

    @PostMapping("/alerts")
    public Alert sendAlerts(@RequestBody Alert alert) {
        return alertRepository.save(alert);
    }

    @DeleteMapping("/alerts/{id}")
    public String deleteAlerts(@PathVariable int id) {
        if (alertRepository.existsById(id)) {
            alertRepository.deleteById(id);
            return "Alert with ID " + id + " was deleted";
        } else {
            return "Alert with ID " + id + " not found.";
        }
    }

}
