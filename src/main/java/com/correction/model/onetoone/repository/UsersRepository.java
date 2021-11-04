package com.correction.model.onetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.correction.model.onetoone.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {

}
