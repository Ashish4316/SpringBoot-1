package com.example.demo.StudentServer.Repository;

import com.example.demo.StudentServer.Entiity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUserName(String userName);
}