package com.sda.study.springbootpractice.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.io.Serializable;

/**
 *
 * School model
 *
 * @author Priit Enno
 * @ Date 22.02.2023
 */

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class School extends Auditable<String> implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String address;
    private String phone;
    private boolean isActive;
}
