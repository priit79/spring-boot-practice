package com.sda.study.springbootpractice.services;

import com.sda.study.springbootpractice.exceptions.CourseNotFoundException;
import com.sda.study.springbootpractice.exceptions.SchoolNotFoundException;
import com.sda.study.springbootpractice.models.School;

import java.util.List;

/**
 * To handle all school related operations
 *
 * @author Priit Enno
 * @ Date 27.02.2023
 */
public interface SchoolService {
    /**
     * To create a new school
     *
     * @param school School
     */
    void createSchool(School school);

    /**
     * To find a school by ID
     *
     * @param id School ID
     * @return School
     */
    School findSchoolById(Long id) throws SchoolNotFoundException;

    /**
     * To find a school by name
     *
     * @param name School name
     * @return School
     */
    School findSchoolByName(String name) throws SchoolNotFoundException;

    /**
     * To find all schools
     *
     * @return a list of School
     */
    List<School> findAllSchools();

    /**
     * To update an existing School
     *
     * @param school School
     */
    void updateSchool(School school) throws SchoolNotFoundException;

    /**
     * To delete a School by ID
     *
     * @param id School ID
     */
    void deleteSchoolById(Long id) throws SchoolNotFoundException, CourseNotFoundException;

    /**
     * To restore a School by ID
     *
     * @param id School ID
     */
    void restoreSchoolById(Long id) throws SchoolNotFoundException, CourseNotFoundException;
}

