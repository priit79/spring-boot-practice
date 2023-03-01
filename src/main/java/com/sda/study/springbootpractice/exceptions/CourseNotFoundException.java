package com.sda.study.springbootpractice.exceptions;


/**
 *
 * Exeption for the course not found
 *
 * @author Priit Enno
 * @ Date 01.03.2023
 */
public class CourseNotFoundException extends Exception {
    private static final long serialVersionUID = 1L;

    public CourseNotFoundException(Long id) {
        super(String.format("Course not found for id: %", id));
    }
    public CourseNotFoundException(String name) {
        super(String.format("Course not found for name: %s", name));
    }
}