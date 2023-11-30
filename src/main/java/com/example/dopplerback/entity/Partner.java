package com.example.dopplerback.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigInteger;
import java.util.List;

@Data
@Entity
@Table(name = "partners")
public class Partner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private BigInteger phone;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private String type;

    @JsonIgnore
    @ManyToMany(mappedBy = "partners")
    private List<Project> projects;
}
