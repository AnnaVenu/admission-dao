package com.student.admission.admissiondao.vo;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "firstName", "lastName", "gender", "dob", "contactDetails" })
public class ParentGuardianVO {

	@JsonProperty("firstName")
	private String firstName;
	@JsonProperty("lastName")
	private String lastName;
	@JsonProperty("gender")
	private String gender;
	@JsonProperty("dob")
	private String dob;
	@JsonProperty("contactDetails")
	private String contactDetails;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	@SuppressWarnings("unused")
	private final static long serialVersionUID = -91223310563708934L;
	
	public ParentGuardianVO() {
		// TODO Auto-generated constructor stub
	}

	public ParentGuardianVO(String firstName, String lastName, String gender, String dob,
			String contactDetails, Map<String, Object> additionalProperties) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dob = dob;
		this.contactDetails = contactDetails;
		this.additionalProperties = additionalProperties;
	}

	@JsonProperty("id")
	public String getFirstName() {
		return firstName;
	}

	@JsonProperty("firstName")
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@JsonProperty("lastName")
	public String getLastName() {
		return lastName;
	}

	@JsonProperty("lastName")
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@JsonProperty("gender")
	public String getGender() {
		return gender;
	}

	@JsonProperty("gender")
	public void setGender(String gender) {
		this.gender = gender;
	}

	@JsonProperty("dob")
	public String getDob() {
		return dob;
	}

	@JsonProperty("dob")
	public void setDob(String dob) {
		this.dob = dob;
	}

	@JsonProperty("contactDetails")
	public String getContactDetails() {
		return contactDetails;
	}

	@JsonProperty("contactDetails")
	public void setContactDetails(String contactDetails) {
		this.contactDetails = contactDetails;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return additionalProperties;
	}

	@JsonAnyGetter
	public void setAdditionalProperties(Map<String, Object> additionalProperties) {
		this.additionalProperties = additionalProperties;
	}
}
