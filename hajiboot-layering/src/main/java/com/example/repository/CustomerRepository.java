package com.example.repository;

import com.example.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by 1015331 on 2016-11-18.
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    @Query("SELECT x FROM Customer x ORDER BY x.firstName, x.lastName")
    List<Customer> findAllOrderByName();

    @Query(value = "SELECT id, first_name, last_name FROM customers ORDER BY id", nativeQuery = true)
    List<Customer> findAllOrderById();
}
