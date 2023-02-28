package com.sda.study.springbootpractice.exceptions;

/**
 * @author Priit Enno
 * @ Date 27.02.2023
 */
public class SchoolNotFoundException extends Exception {
    private static final long serialVersionUID = 1L;

    public SchoolNotFoundException(Long id) {

        super(String.format("School not found for id: %", id));
    }
    public SchoolNotFoundException(String name) {
        super(String.format("School not found for name: %s", name));
    }
}
