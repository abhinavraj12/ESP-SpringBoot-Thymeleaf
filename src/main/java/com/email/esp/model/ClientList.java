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
@Table(name = "client_list")
public class ClientList {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long clientId;

	@Column(nullable = false, length = 55)
	private String name;

	@Column(nullable = false, unique = true)
	private String email;

	@Column(nullable = false, unique = true)
	private String phone;

	@Column(length = 100)
	private String address;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private User user;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private TemplateMail templateMail;

	public ClientList() {
		super();
	
	}

	public ClientList(Long clientId, String name, String email, String phone, String address, User user,
			TemplateMail templateMail) {
		super();
		this.clientId = clientId;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.user = user;
		this.templateMail = templateMail;
	}

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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
		return "ClientList [clientId=" + clientId + ", name=" + name + ", email=" + email + ", phone=" + phone
				+ ", address=" + address + ", user=" + user + ", templateMail=" + templateMail + "]";
	}
	
	

}
