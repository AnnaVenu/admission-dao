package com.student.admission.admissiondao.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
public class ParentGuardian implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "P_FIRSTNAME")
	private String pFirstName;
	@Column(name = "P_LASTNAME")
	private String pLastName;
	@Enumerated(EnumType.STRING)
	@Column(name = "P_GENDER")
	private Gender pGender;
	/*@Column(name = "P_PARENT_DOB")
	private String pDob;*/
	@Column(name = "P_CONTACT_DETAILS")
	private String pContactDetails;

	public ParentGuardian() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ParentGuardian(String pFirstName, String pLastName, Gender pGender, String pContactDetails) {
		super();
		this.pFirstName = pFirstName;
		this.pLastName = pLastName;
		/*this.pGender = pGender;
		this.pDob = pDob;*/
		this.pContactDetails = pContactDetails;
	}

	public String getpFirstName() {
		return pFirstName;
	}

	public void setpFirstName(String pFirstName) {
		this.pFirstName = pFirstName;
	}

	public String getpLastName() {
		return pLastName;
	}

	public void setpLastName(String pLastName) {
		this.pLastName = pLastName;
	}

	public Gender getpGender() {
		return pGender;
	}

	public void setpGender(Gender pGender) {
		this.pGender = pGender;
	}

	public String getpContactDetails() {
		return pContactDetails;
	}

	public void setpContactDetails(String pContactDetails) {
		this.pContactDetails = pContactDetails;
	}

	/*public String getpDob() {
		return pDob;
	}

	public void setpDob(String pDob) {
		this.pDob = pDob;
	}*/

}
