package com.example.ejemplo;

import com.example.ejemplo.entities.Empleado;
import com.example.ejemplo.repository.EmpleadoRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.Local;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class EjemploApplication {

    public static void main(String[] args) {
       ApplicationContext context =  SpringApplication.run(EjemploApplication.class, args);

        var empleRepo = context.getBean(EmpleadoRepository.class);

        List<Empleado> empleados = List.of(
                new Empleado(null,"employee1", LocalDate.now(),true),
                new Empleado(null,"employee2", LocalDate.now(),false),
                new Empleado(null,"employee3",LocalDate.now(),true),
                new Empleado(null,"employee4", LocalDate.now(),false),
                new Empleado(null,"employee5", LocalDate.now(),true)

        );
        empleRepo.saveAll(empleados);
        empleRepo.findAllByMarriedTrue().forEach(System.out::println);




    }

}
