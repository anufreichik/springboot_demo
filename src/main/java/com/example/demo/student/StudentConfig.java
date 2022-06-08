package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student marina = new Student(
                    "Marina",
                    "marina@p.com",
                    LocalDate.of(2000, Month.JANUARY, 5),
                    21
            );
            Student alex = new Student(
                    "Alex",
                    "alex@p.com",
                    LocalDate.of(2000, Month.JANUARY, 5),
                    21
            );

            repository.saveAll(
                    List.of(marina, alex)
            );
        };
    }

}
