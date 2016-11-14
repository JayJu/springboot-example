package com.example;

import com.example.domain.Customer;
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
    NamedParameterJdbcTemplate jdbcTemplate;


    @Override
    public void run(String... strings) throws Exception {
        String sql = "SELECT id, first_name, last_name FROM  customers WHERE id = :id";
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("id", 1);
        Customer result = jdbcTemplate.queryForObject(sql, param, new RowMapper<Customer>() {
            @Override
            public Customer mapRow(ResultSet resultSet, int i) throws SQLException {
                return new Customer(resultSet.getInt("id"), resultSet.getString("first_name"), resultSet.getString("last_name"));
            }
        });

        System.out.println("result: " + result);
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}