package com.example.LearnSpringBoot.Courses.repository;

import com.example.LearnSpringBoot.Courses.bean.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Integer> {
}
