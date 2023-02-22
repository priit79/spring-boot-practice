package com.sda.study.springbootpractice.repositories;

import com.sda.study.springbootpractice.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Priit Enno
 * @ Date 22.02.2023
 */
@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}