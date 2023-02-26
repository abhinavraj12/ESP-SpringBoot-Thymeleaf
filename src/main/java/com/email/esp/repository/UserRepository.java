package com.email.esp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.email.esp.model.User;


public interface UserRepository extends JpaRepository<User, Long> {


}
