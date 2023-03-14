package com.sda.study.springbootpractice.repositories;

import com.sda.study.springbootpractice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Repository to handle user related queries
 *
 * @author Priit Enno
 * @Date 13.03.2023
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}