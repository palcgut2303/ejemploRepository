package com.example.ejemplo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "empleados")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ffull_name",unique = true)
    private String fullName;

    private LocalDate birthDate;

    private Boolean married;


}
