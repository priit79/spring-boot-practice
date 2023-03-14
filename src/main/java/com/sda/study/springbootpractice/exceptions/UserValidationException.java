package com.sda.study.springbootpractice.exceptions;

/**
 * Exception to handle user validation
 *
 * @author Priit Enno
 * @Date 14.03.2023
 */
public class UserValidationException extends Exception {
    private static final long serialVersionUID = 1L;

    public UserValidationException(String name, String message) {
        super(String.format("User validation failed for user: %s, Error: %s", name, message));
    }
}