package com.example.ejemplo.repository;

import com.example.ejemplo.entities.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado,Long> {

    Optional<Empleado> findByFullName(String fullName);
    Optional<Empleado> findByFullNameAndBirthDate (String fullName, LocalDate birthDate);
    List<Empleado> findAllByMarriedTrue();

    void deleteAllByFullName(String fullName);


}
