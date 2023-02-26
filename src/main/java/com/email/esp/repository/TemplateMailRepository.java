package com.email.esp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.email.esp.model.TemplateMail;


public interface TemplateMailRepository extends JpaRepository<TemplateMail, Long> {

}
