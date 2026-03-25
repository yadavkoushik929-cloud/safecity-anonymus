package com.safety.safecity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/incidents")
public class IncidentController {

    @Autowired
    private IncidentService incidentService;

    @PostMapping("/report")
    public Incident report(@RequestBody Incident incident){
        return incidentService.report(incident);
    }

    @GetMapping("/all")
    public List<Incident> getAll(){
        return incidentService.getAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        incidentService.delete(id);
    }
}
