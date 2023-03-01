package com.sda.study.springbootpractice.services;

import com.sda.study.springbootpractice.exceptions.TeacherNotFoundException;
import com.sda.study.springbootpractice.models.Teacher;

import java.util.List;

/**
 * To handle all teacher related operations
 *
 * @author Priit Enno
 * @ Date 01.03.2023
 */
public interface TeacherService {
    /**
     * To create a new teacher
     *
     * @param teacher Teacher
     */
    void createTeacher(Teacher teacher);

    /**
     * To find a teacher by ID
     *
     * @param id TeacherID
     * @return Teacher
     */
    Teacher findTeacherById(Long id) throws TeacherNotFoundException;

    /**
     * To find a teacher by name
     *
     * @param name Teachername
     * @return Teacher
     */
    Teacher findTeacherByName(String name) throws TeacherNotFoundException;

    /**
     * To find all teachers
     *
     * @return a list of Teacher
     */
    List<Teacher> findAllTeachers();

    /**
     * To update an existing Teacher
     *
     * @param teacher Teacher
     */
    void updateTeacher(Teacher teacher) throws TeacherNotFoundException;

    /**
     * To delete a Teacherby ID
     *
     * @param id TeacherID
     */
    void deleteTeacherById(Long id) throws TeacherNotFoundException;

    /**
     * To restore a Teacherby ID
     *
     * @param id TeacherID
     */
    void restoreTeacherById(Long id) throws TeacherNotFoundException;
}

