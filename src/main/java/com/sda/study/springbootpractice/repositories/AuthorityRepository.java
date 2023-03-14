package com.sda.study.springbootpractice.repositories;

import com.sda.study.springbootpractice.models.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Repository to handle authority related queries
 *
 * @author Priit Enno
 * @Date 13.03.2023
 */
@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long> {
    Optional<Authority> findByName(String name);
}