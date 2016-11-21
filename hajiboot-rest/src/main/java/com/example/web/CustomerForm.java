package com.example.web;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by 1015331 on 2016-11-21.
 */
@Data
public class CustomerForm {
    @NotNull
    @Size(min = 1, max = 127)
    private String firstName;
    @NotNull
    @Size(min = 1, max = 127)
    private String lastName;
}
