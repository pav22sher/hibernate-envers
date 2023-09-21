package com.example.hibernateenvers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.envers.repository.config.EnableEnversRepositories;

@EnableEnversRepositories
@SpringBootApplication
public class HibernateEnversApplication {

    public static void main(String[] args) {
        SpringApplication.run(HibernateEnversApplication.class, args);
    }

}
