package com.sda.study.springbootpractice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Priit Enno
 * @ Date 13.03.2023
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional <User> findByUsername(String username)}
