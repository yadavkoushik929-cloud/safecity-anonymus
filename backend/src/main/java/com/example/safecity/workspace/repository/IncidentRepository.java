package com.example.safecity.workspace.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.safecity.workspace.model.Incident;

public interface IncidentRepository extends JpaRepository<Incident, Long> {}