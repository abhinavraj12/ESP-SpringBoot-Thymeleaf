package com.email.esp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee_list")
public class EmployeeList {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long employeeId;

	@Column(nullable = false, length = 55)
	private String name;

	@Column(nullable = false, unique = true)
	private String email;

	@Column(nullable = false, unique = true)
	private String phone;

	@Column(nullable = false, length = 100)
	private String jobTitle;

	
	@ManyToOne(fetch = FetchType.EAGER)
	private User user;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private TemplateMail templateMail;

	public EmployeeList() {
		super();
		
	}

	public EmployeeList(Long employeeId, String name, String email, String phone, String jobTitle, User user,
			TemplateMail templateMail) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.jobTitle = jobTitle;
		this.user = user;
		this.templateMail = templateMail;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public TemplateMail getTemplateMail() {
		return templateMail;
	}

	public void setTemplateMail(TemplateMail templateMail) {
		this.templateMail = templateMail;
	}

	@Override
	public String toString() {
		return "EmployeeList [employeeId=" + employeeId + ", name=" + name + ", email=" + email + ", phone=" + phone
				+ ", jobTitle=" + jobTitle + ", user=" + user + ", templateMail=" + templateMail + "]";
	}
	
	
	
}
