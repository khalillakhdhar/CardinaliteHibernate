package com.correction.model.manytoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.correction.model.manytoone.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
