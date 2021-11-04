package com.correction.model.onetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.correction.model.onetoone.UserProfile;

public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {

}
