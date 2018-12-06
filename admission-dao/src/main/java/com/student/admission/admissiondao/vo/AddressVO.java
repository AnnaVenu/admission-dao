package com.student.admission.admissiondao.vo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/*import org.apache.commons.lang.builder.ToStringBuilder;*/

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "sRollNo", "doorNumber", "streetName", "district", "state", "zipCode" })
public class AddressVO implements Serializable {

	@JsonProperty("id")
	private int id;
	@JsonProperty("sRollNo")
	private String sRollNo;
	@JsonProperty("doorNumber")
	private String doorNumber;
	@JsonProperty("streetName")
	private String streetName;
	@JsonProperty("district")
	private String district;
	@JsonProperty("state")
	private String state;
	@JsonProperty("zipCode")
	private String zipCode;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -9122331056376108934L;

	/**
	 * No args constructor for use in serialization
	 * 
	 * 
	 */
	public AddressVO() {
	}

	/**
	 * 
	 * @param id
	 * @param zipCode
	 * @param state
	 * @param streetName
	 * @param district
	 * @param doorNumber
	 */
	public AddressVO(int id, String sRollNo, String doorNumber, String streetName, String district, String state,
			String zipCode) {
		super();
		this.id = id;
		this.sRollNo = sRollNo;
		this.doorNumber = doorNumber;
		this.streetName = streetName;
		this.district = district;
		this.state = state;
		this.zipCode = zipCode;
	}

	@JsonProperty("id")
	public int getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(int id) {
		this.id = id;
	}

	@JsonProperty("sRollNo")
	public String getsRollNo() {
		return sRollNo;
	}

	@JsonProperty("sRollNo")
	public void setsRollNo(String sRollNo) {
		this.sRollNo = sRollNo;
	}

	@JsonProperty("doorNumber")
	public String getDoorNumber() {
		return doorNumber;
	}

	@JsonProperty("doorNumber")
	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}

	@JsonProperty("streetName")
	public String getStreetName() {
		return streetName;
	}

	@JsonProperty("streetName")
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	@JsonProperty("district")
	public String getDistrict() {
		return district;
	}

	@JsonProperty("district")
	public void setDistrict(String district) {
		this.district = district;
	}

	@JsonProperty("state")
	public String getState() {
		return state;
	}

	@JsonProperty("state")
	public void setState(String state) {
		this.state = state;
	}

	@JsonProperty("zipCode")
	public String getZipCode() {
		return zipCode;
	}

	@JsonProperty("zipCode")
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		return "AddressVO [id=" + id + ", sRollNo=" + sRollNo + ", doorNumber=" + doorNumber + ", streetName="
				+ streetName + ", district=" + district + ", state=" + state + ", zipCode=" + zipCode
				+ ", additionalProperties=" + additionalProperties + "]";
	}

	/*
	 * @Override public String toString() { return new
	 * ToStringBuilder(this).append("id", id).append("doorNumber", doorNumber)
	 * .append("streetName", streetName).append("district",
	 * district).append("state", state) .append("zipCode",
	 * zipCode).append("additionalProperties", additionalProperties).toString(); }
	 */

}