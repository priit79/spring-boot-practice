package com.sda.study.springbootpractice.exceptions;


/**
 *
 * Exeption for the teacher not found
 *
 * @author Priit Enno
 * @ Date 01.03.2023
 */
public class TeacherNotFoundException extends Exception {
    private static final long serialVersionUID = 1L;

    public TeacherNotFoundException(Long id) {
        super(String.format("Teacher not found for id: %", id));
    }
    public TeacherNotFoundException(String name) {
        super(String.format("Teacher not found for name: %s", name));
    }
}
