package com.example.repository;

import com.example.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 1015331 on 2016-11-24.
 */
public interface UserRepository extends JpaRepository<User, String> {
}
