package com.sda.study.springbootpractice.models;

import lombok.Data;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 * Teacher model
 *
 * @author Priit Enno
 * @ Date 22.02.2023
 */

@EqualsAndHashCode(callSuper = false)
@Entity
@Data
public class Teacher extends Auditable<String> implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String email;

    @OneToMany(cascade = CascadeType.MERGE)
    private List<Course> specializedCourses;

    private boolean isActive;
}
