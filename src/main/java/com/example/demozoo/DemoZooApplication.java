package com.example.demozoo;

import com.example.demozoo.service.IDatabase;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoZooApplication {
    private final IDatabase database;

    public DemoZooApplication(IDatabase database) {
        this.database = database;
    }


    public static void main(String[] args) {
        SpringApplication.run(DemoZooApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner() {
        return result -> database.createTable();
    }
}