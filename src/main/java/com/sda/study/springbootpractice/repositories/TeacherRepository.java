package com.sda.study.springbootpractice.repositories;

import com.sda.study.springbootpractice.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Priit Enno
 * @ Date 22.02.2023
 */
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
