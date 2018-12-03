package com.student.admission.admissiondao.vo;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "pFirstName", "pLastName", "pGender", "pdob", "pContactDetails" })
public class ParentGuardianVO {

	@JsonProperty("pFirstName")
	private String pFirstName;
	@JsonProperty("pLastName")
	private String pLastName;
	@JsonProperty("pGender")
	private String pGender;
	@JsonProperty("pdob")
	private String pdob;
	@JsonProperty("pContactDetails")
	private String pContactDetails;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	@SuppressWarnings("unused")
	private final static long serialVersionUID = -91223310563708934L;

	public ParentGuardianVO() {
		// TODO Auto-generated constructor stub
	}

	
	public ParentGuardianVO(String pFirstName, String pLastName, String pGender, String pdob, String pContactDetails,
			Map<String, Object> additionalProperties) {
		super();
		this.pFirstName = pFirstName;
		this.pLastName = pLastName;
		this.pGender = pGender;
		this.pdob = pdob;
		this.pContactDetails = pContactDetails;
		this.additionalProperties = additionalProperties;
	}

	@JsonProperty("pFirstName")
	public String getpFirstName() {
		return pFirstName;
	}

	@JsonProperty("pFirstName")
	public void setpFirstName(String pFirstName) {
		this.pFirstName = pFirstName;
	}

	@JsonProperty("pLastName")
	public String getpLastName() {
		return pLastName;
	}

	@JsonProperty("pLastName")
	public void setpLastName(String pLastName) {
		this.pLastName = pLastName;
	}

	@JsonProperty("pGender")
	public String getpGender() {
		return pGender;
	}

	@JsonProperty("pGender")
	public void setpGender(String pGender) {
		this.pGender = pGender;
	}

	@JsonProperty("pdob")
	public String getPdob() {
		return pdob;
	}

	@JsonProperty("pdob")
	public void setPdob(String pdob) {
		this.pdob = pdob;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return additionalProperties;
	}

	@JsonProperty("pContactDetails")
	public String getpContactDetails() {
		return pContactDetails;
	}

	@JsonProperty("pContactDetails")
	public void setpContactDetails(String pContactDetails) {
		this.pContactDetails = pContactDetails;
	}

	@JsonAnyGetter
	public void setAdditionalProperties(Map<String, Object> additionalProperties) {
		this.additionalProperties = additionalProperties;
	}
}
