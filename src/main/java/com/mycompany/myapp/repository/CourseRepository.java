package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Course;

import com.mycompany.myapp.domain.User;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.time.Instant;


public interface CourseRepository extends JpaRepository<Course, Long> {

    Optional<Course> findCourseByCourseName(String courseName);
    Optional<Course> findCourseByTeacherId(long teacherId);
}
