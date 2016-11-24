package com.example.service;

import lombok.Data;
import com.example.domain.User;
import org.springframework.security.core.authority.AuthorityUtils;

/**
 * Created by 1015331 on 2016-11-24.
 */
@Data
public class LoginUserDetails extends org.springframework.security.core.userdetails.User {
    private final  User user;

    public LoginUserDetails(User user) {
        super(user.getUsername(), user.getEncodedPassword(), AuthorityUtils.createAuthorityList("ROLE_USER"));
        this.user = user;
    }
}
