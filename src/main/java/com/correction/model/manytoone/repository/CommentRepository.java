package com.correction.model.manytoone.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.correction.model.manytoone.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
List<Comment> findByPostId(long postId);
Optional<Comment> findByIdAndPostId(long id,long postId);
}
