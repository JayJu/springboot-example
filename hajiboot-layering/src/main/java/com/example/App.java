package com.example;

import com.example.domain.Customer;
import com.example.repository.CustomerRepository;
import com.example.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by 1015331 on 2016-11-11.
 */
@EnableAutoConfiguration
@ComponentScan
public class App implements CommandLineRunner{
    @Autowired
    CustomerRepository customerRepository;


    @Override
    public void run(String... strings) throws Exception {
        //데이터 추가
        Customer created = customerRepository.save(new Customer(null, "Trump", "Donald"));
        System.out.println(created + "is created!");

        //데이터 표시
        customerRepository.findAll()
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}