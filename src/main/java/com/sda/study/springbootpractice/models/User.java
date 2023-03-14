package com.sda.study.springbootpractice.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * User model
 *
 * @author Priit Enno
 * @Date 13.03.2023
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "users")
public class User extends Auditable<String> implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;
    private String password;

    @OneToOne(cascade = CascadeType.MERGE)
    private Authority authority;

    private boolean isActive;
}