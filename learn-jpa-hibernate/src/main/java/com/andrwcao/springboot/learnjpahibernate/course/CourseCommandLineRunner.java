package com.andrwcao.springboot.learnjpahibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.andrwcao.springboot.learnjpahibernate.course.jpa.CourseJpaRepository;
import com.andrwcao.springboot.learnjpahibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    // @Autowired
    // private CourseJdbcRepository repository;

    // @Autowired
    // private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    /*
     * @Override
     * public void run(String... args) {
     * repository.insert(new Course(1, "Learn AWS", "andrwcao"));
     * repository.insert(new Course(2, "Learn Azure", "andrwcao"));
     * repository.insert(new Course(3, "Learn GCP", "andrwcao"));
     * 
     * repository.deleteById(2);
     * 
     * System.out.println(repository.findById(3));
     * }
     */
    @Override
    public void run(String... args) {
        repository.save(new Course(1, "Learn AWS", "andrwcao"));
        repository.save(new Course(2, "Learn Azure", "andrwcao"));
        repository.save(new Course(3, "Learn GCP", "andrwcao"));

        repository.deleteById(2l);

        System.out.println(repository.findById(3l));
    }
}
