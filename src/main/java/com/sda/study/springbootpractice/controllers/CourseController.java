package com.sda.study.springbootpractice.controllers;

import com.sda.study.springbootpractice.exceptions.CourseNotFoundException;

import com.sda.study.springbootpractice.models.Course;
import com.sda.study.springbootpractice.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @author Priit Enno
 * @Date 01.03.2023
 */
@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping
    public List<Course> findAllCourses() {
        return courseService.findAllCourses();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findCourseById(@PathVariable Long id) throws CourseNotFoundException {
        Course course = courseService.findCourseById(id);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.setDate(new Date().toInstant());
        return new ResponseEntity<>(course, httpHeaders, HttpStatus.OK);
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity<?> deleteCourse(@PathVariable Long id) throws CourseNotFoundException, CourseNotFoundException {
        courseService.deleteCourseById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // Called when we press submit button in the create-course form
    @PostMapping
    public ResponseEntity<?> createCourse(@RequestBody Course course) {
        try {
            Course searchCourse = courseService.findCourseByName(course.getName());
            throw new RuntimeException("Course already exists! Cannot create this course!");
        } catch (CourseNotFoundException e) {
            courseService.createCourse(course);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }
    }

    @PostMapping("/update")
    public ResponseEntity<?> updateCourse(@RequestBody Course course) throws CourseNotFoundException {
        courseService.updateCourse(course);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/restore/{id}")
    public ResponseEntity<?> restoreCourse(@PathVariable Long id) throws CourseNotFoundException, CourseNotFoundException {
        courseService.restoreCourseById(id);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.setDate(new Date().toInstant());

        return new ResponseEntity<>(httpHeaders, HttpStatus.OK);
    }
}