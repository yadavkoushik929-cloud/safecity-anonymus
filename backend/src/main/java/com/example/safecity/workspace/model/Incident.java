package com.example.safecity.workspace.model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Incident {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String location;
    private String description;
}