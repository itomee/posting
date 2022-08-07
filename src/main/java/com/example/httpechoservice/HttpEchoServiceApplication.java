package com.example.httpechoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@AutoConfiguration
public class HttpEchoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HttpEchoServiceApplication.class, args);
    }
}
