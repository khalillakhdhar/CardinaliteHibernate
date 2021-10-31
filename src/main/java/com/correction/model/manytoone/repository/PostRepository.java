package com.correction.model.manytoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.correction.model.manytoone.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
