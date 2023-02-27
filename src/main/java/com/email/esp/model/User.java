package com.email.esp.model;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "user_details")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;


	private String name;

	@Column(nullable = false)
	private String email;

	@JsonIgnore
	@Column(nullable = false)
	private String password;

	@Column(nullable = false)
	private String phone;

	@Column(length = 500)
	private String about;

	@Column
	private String profilePic;

	@Column(name = "enabled")
	private Boolean enabled = true;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<ClientList> clientList = new LinkedHashSet<>();

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<EmployeeList> employeeList = new LinkedHashSet<>();

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<TemplateMail> templateMail = new LinkedHashSet<>();

	public User() {
		super();
	}

	

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	


	public Set<ClientList> getClientList() {
		return clientList;
	}



	public void setClientList(Set<ClientList> clientList) {
		this.clientList = clientList;
	}



	public Set<EmployeeList> getEmployeeList() {
		return employeeList;
	}



	public void setEmployeeList(Set<EmployeeList> employeeList) {
		this.employeeList = employeeList;
	}



	public Set<TemplateMail> getTemplateMail() {
		return templateMail;
	}



	public void setTemplateMail(Set<TemplateMail> templateMail) {
		this.templateMail = templateMail;
	}


	
	public User(Long userId, String name, String email, String password, String phone, String about, String profilePic,
			Boolean enabled, Set<ClientList> clientList, Set<EmployeeList> employeeList,
			Set<TemplateMail> templateMail) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.about = about;
		this.profilePic = profilePic;
		this.enabled = enabled;
		this.clientList = clientList;
		this.employeeList = employeeList;
		this.templateMail = templateMail;
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + ", password=" + password + ", phone="
				+ phone + ", about=" + about + ", profilePic=" + profilePic + ", enabled=" + enabled + ", clientList="
				+ clientList + ", employeeList=" + employeeList + ", templateMail=" + templateMail + "]";
	}


}
