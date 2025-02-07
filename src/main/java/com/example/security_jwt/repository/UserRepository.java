package com.example.security_jwt.repository;

import com.example.security_jwt.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    Boolean existsByUsername(String username);
    UserEntity findByUsername(String username);

}
