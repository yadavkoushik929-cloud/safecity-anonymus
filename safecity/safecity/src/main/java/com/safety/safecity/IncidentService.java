package com.safety.safecity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class IncidentService {

    @Autowired
    private IncidentRepository incidentRepository;

    public Incident report(Incident incident){
        return incidentRepository.save(incident);
    }

    public List<Incident> getAll(){
        return incidentRepository.findAll();
    }

    public void delete(Long id){
        incidentRepository.deleteById(id);
    }
}
