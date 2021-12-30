package com.example.LearnSpringBoot.Courses.Controller;

import com.example.LearnSpringBoot.Courses.bean.Course;
import com.example.LearnSpringBoot.Courses.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;


@RestController
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @GetMapping("/courses")
    public List<Course> getAllCourse(){
//        return Arrays.asList(new Course(1, "Learn SpringBoot", "UDEMY"),
//                new Course(2,"Learn spring", "Bikash"));
        return courseRepository.findAll();
    }
    @GetMapping("/courses/1")
    public Course getCourse() {
        return new Course(1, "Learn SpringBoot", "UDEMY");
    }
}
