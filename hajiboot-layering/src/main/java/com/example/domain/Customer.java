package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * Created by 1015331 on 2016-11-11.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Customer {
    private Integer id;
    private String firstName;
    private String lastName;
}
