package com.restexample.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            var alex = new Student(
                    "alex",
                    "alex@server.com",
                    LocalDate.of(2000, Month.JANUARY, 17)
            );
            var john = new Student(
                    "john",
                    "john@server.com",
                    LocalDate.of(2008, Month.AUGUST, 14)
            );

            repository.saveAll(List.of(alex, john));
        };
    }
}
