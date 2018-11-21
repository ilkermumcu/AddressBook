package com.mtag.addressbook.entity;

import java.util.Set;
import java.util.TreeSet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "contacts")
public class Contacts {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
    
	@Column(name="first_name")
	private String firstName;
  
	@Column(name="last_name")
	private String lastName;

	@Column(name="profession")
	private String profession;
	
	@Column(name="email")
	private String email;

	@Column(name="home_phone")
	private String homePhone;

	@Column(name="mobile")
	private String mobile;
	
	@OneToMany(mappedBy="contacts")
	private Set<Addresses>addresses = new TreeSet<Addresses>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Set<Addresses> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<Addresses> addresses) {
		this.addresses = addresses;
	}

	
	

}
