package com.lix02.mylocat.backend.Location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LocationController {

    @Autowired
    private LocationRepository locationRepository;

    @GetMapping("/locations")
    public List<Location> getLocation() {
        return locationRepository.findAll();
    }

    @PostMapping("/locations")
    public Location sendLocation(@RequestBody Location location) {
        return locationRepository.save(location);
    }

    @DeleteMapping("/locations/{id}")
    public String deleteLocation(@PathVariable int id) {
        if (locationRepository.existsById(id)) {
            locationRepository.deleteById(id);
            return "Location with ID " + id + " was deleted.";
        } else {
            return "Location with ID " + id + " not found.";
        }
    }


}
