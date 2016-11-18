package com.example.repository;

import com.example.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 1015331 on 2016-11-18.
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
