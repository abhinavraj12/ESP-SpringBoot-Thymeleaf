package com.email.esp.model;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "mail_template")
public class TemplateMail {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long templateId;
	
	@Column(nullable = false, length = 55)
	private String name;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private User user;
	
	@OneToMany(mappedBy = "templateMail", cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<EmployeeList> employeeLists = new LinkedHashSet<>();
	
	@OneToMany(mappedBy = "templateMail", cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<ClientList> clientLists = new LinkedHashSet<>();

	public TemplateMail() {
		super();

	}

	public TemplateMail(Long templateId, String name, User user, Set<EmployeeList> employeeLists,
			Set<ClientList> clientLists) {
		super();
		this.templateId = templateId;
		this.name = name;
		this.user = user;
		this.employeeLists = employeeLists;
		this.clientLists = clientLists;
	}

	public Long getTemplateId() {
		return templateId;
	}

	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<EmployeeList> getEmployeeLists() {
		return employeeLists;
	}

	public void setEmployeeLists(Set<EmployeeList> employeeLists) {
		this.employeeLists = employeeLists;
	}

	public Set<ClientList> getClientLists() {
		return clientLists;
	}

	public void setClientLists(Set<ClientList> clientLists) {
		this.clientLists = clientLists;
	}

	@Override
	public String toString() {
		return "TemplateMail [templateId=" + templateId + ", name=" + name + ", user=" + user + ", employeeLists="
				+ employeeLists + ", clientLists=" + clientLists + "]";
	}
	
}
