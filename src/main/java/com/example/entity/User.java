package com.example.entity;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.example.repository.UserRepository;

@Document(collection = "USER")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	@Transient
	private UserRepository userRepository;

	@Id
	private String ID;

	@Field(value = "FirstName")
	private String FIRSTNAME;

	@Field(value = "LastName")
	private String LASTNAME;

	public User() {
	}

	public User(String FIRSTNAME, String LASTNAME) {
		this.FIRSTNAME = FIRSTNAME;
		this.LASTNAME = LASTNAME;
	}

	public String getFIRSTNAME() {
		return FIRSTNAME;
	}

	public void setFIRSTNAME(String FIRSTNAME) {
		this.FIRSTNAME = FIRSTNAME;
	}

	public String getLASTNAME() {
		return LASTNAME;
	}

	public void setLASTNAME(String LASTNAME) {
		this.LASTNAME = LASTNAME;
	}

	@Override
	public String toString() {
		return "Hello! " + this.FIRSTNAME + " " + this.LASTNAME;
	}

}
