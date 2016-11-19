package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by 1015331 on 2016-11-11.
 */
@EnableAutoConfiguration
@ComponentScan
public class App{
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}