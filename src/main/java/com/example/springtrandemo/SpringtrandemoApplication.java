package com.example.springtrandemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "transactionManagement")
public class SpringtrandemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringtrandemoApplication.class, args);
    }

}
