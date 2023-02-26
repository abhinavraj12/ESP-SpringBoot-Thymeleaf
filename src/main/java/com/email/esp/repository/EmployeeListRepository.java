package com.email.esp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.email.esp.model.EmployeeList;


public interface EmployeeListRepository extends JpaRepository<EmployeeList, Long> {

}
