package com.andrwcao.rest.webservices.restfulwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrwcao.rest.webservices.restfulwebservices.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
