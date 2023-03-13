package com.sda.study.springbootpractice.repositories;

import org.springframework.stereotype.Repository;

/**
 * @author Priit Enno
 * @ Date 13.03.2023
 */

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long> {
    Optional<Authority> findByName(String name);
}
