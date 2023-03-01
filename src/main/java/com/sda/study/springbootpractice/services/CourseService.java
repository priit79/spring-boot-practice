package com.sda.study.springbootpractice.services;

import com.sda.study.springbootpractice.exceptions.CourseNotFoundException;
import com.sda.study.springbootpractice.models.Course;
import com.sda.study.springbootpractice.models.School;

import java.util.List;

/**
 * To handle all teacher related operations
 *
 * @author Priit Enno
 * @ Date 01.03.2023
 */
public interface CourseService {
    /**
     * To create a new teacher
     *
     * @param teacher Course
     */
    void createCourse(Course teacher);

    /**
     * To find a teacher by ID
     *
     * @param id Course ID
     * @return Course
     */
    Course findCourseById(Long id) throws CourseNotFoundException;

    /**
     * To find a teacher by name
     *
     * @param name Course name
     * @return Course
     */
    Course findCourseByName(String name) throws CourseNotFoundException;

    /**
     * To find all teachers
     *
     * @return a list of Course
     */
    List<Course> findAllCourses();

    /**
     * To find all courses by school
     *
     * @param school School
     * @return a list of Course
     */
    List<Course> findAllCoursesBySchool(School school);

    /**
     * To update an existing Course
     *
     * @param teacher Course
     */
    void updateCourse(Course teacher) throws CourseNotFoundException;

    /**
     * To delete a Course by ID
     *
     * @param id Course ID
     */
    void deleteCourseById(Long id) throws CourseNotFoundException;

    /**
     * To restore a Course by ID
     *
     * @param id Course ID
     */
    void restoreCourseById(Long id) throws CourseNotFoundException;
}

