package com.andrwcao.springboot.learnjpahibernate.course.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrwcao.springboot.learnjpahibernate.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

}
