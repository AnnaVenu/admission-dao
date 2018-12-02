package com.student.admission.admissiondao.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
public class ParentGuardian {

	@Column(name = "P_FIRSTNAME")
	private String firstName;
	@Column(name = "P_LASTNAME")
	private String lastName;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	@Column(name = "P_PARENT_DOB")
	private Date dob;
	@Column(name = "P_CONTACT_DETAILS")
	private String contactDetails;

	public ParentGuardian() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ParentGuardian(String firstName, String lastName, Gender gender, Date dob, String contactDetails) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dob = dob;
		this.contactDetails = contactDetails;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Gender getGender() {
		return gender;
	}

	public Date getDob() {
		return dob;
	}

	public String getContactDetails() {
		return contactDetails;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public void setContactDetails(String contactDetails) {
		this.contactDetails = contactDetails;
	}
}
