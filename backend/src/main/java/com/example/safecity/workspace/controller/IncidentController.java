package com.example.safecity.workspace.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.safecity.workspace.model.Incident;
import com.example.safecity.workspace.repository.IncidentRepository;

import java.util.List;

@RestController
@RequestMapping("/api/incidents")
@CrossOrigin(origins = "http://localhost:3000") // Crucial for React connection
public class IncidentController {
    @Autowired
    private IncidentRepository repo;

    @GetMapping
    public List<Incident> getIncidents() { return repo.findAll(); }

    @PostMapping
    public Incident addIncident(@RequestBody Incident incident) { return repo.save(incident); }
}