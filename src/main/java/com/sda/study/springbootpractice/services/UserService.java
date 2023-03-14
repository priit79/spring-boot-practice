package com.sda.study.springbootpractice.services;


import com.sda.study.springbootpractice.exceptions.UserNotFoundException;
import com.sda.study.springbootpractice.models.User;

import java.util.List;

/**
 * Service to handle user related operations
 *
 * @author Priit Enno
 * @Date 13.03.2023
 */
public interface UserService {
    /**
     * To find all users
     *
     * @return a list of User
     */
    List<User> findAllUsers();

    /**
     * To find user by Username
     *
     * @param username username
     * @return User
     */
    User findUserByUsername(String username) throws UserNotFoundException;

    /**
     * To create a new User
     *
     * @param user User
     */
    void createUser(User user);
}