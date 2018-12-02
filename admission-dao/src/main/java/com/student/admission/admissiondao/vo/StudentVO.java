package com.student.admission.admissiondao.vo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "firstName", "lastName", "fatherName", "motherName", "gender", "dob", "classType", "section",
		"rollNo", "admissionDate", "religion", "admissionNumber", "nationality", "identificationMarks", "address","parentDetails" })
public class StudentVO implements Serializable {

	@JsonProperty("id")
	private int id;
	@JsonProperty("firstName")
	private String firstName;
	@JsonProperty("lastName")
	private String lastName;
	@JsonProperty("fatherName")
	private String fatherName;
	@JsonProperty("motherName")
	private String motherName;
	@JsonProperty("gender")
	private String gender;
	@JsonProperty("dob")
	private String dob;
	@JsonProperty("classType")
	private String classType;
	@JsonProperty("section")
	private String section;
	@JsonProperty("rollNo")
	private String rollNo;
	@JsonProperty("admissionDate")
	private String admissionDate;
	@JsonProperty("religion")
	private String religion;
	@JsonProperty("admissionNumber")
	private String admissionNumber;
	@JsonProperty("nationality")
	private String nationality;
	@JsonProperty("identificationMarks")
	private List<String> identificationMarks = null;
	@JsonProperty("address")
	private List<AddressVO> address = null;
	@JsonProperty("parentDetails")
	private ParentGuardianVO parentDetails = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -6182386366865365180L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public StudentVO() {
	}

	/**
	 * 
	 * @param lastName
	 * @param admissionDate
	 * @param motherName
	 * @param identificationMarks
	 * @param admissionNumber
	 * @param classType
	 * @param section
	 * @param id
	 * @param religion
	 * @param nationality
	 * @param address
	 * @param rollNo
	 * @param dob
	 * @param gender
	 * @param firstName
	 * @param fatherName
	 */
	public StudentVO(int id, String firstName, String lastName, String fatherName, String motherName, String gender,
			String dob, String classType, String section, String rollNo, String admissionDate, String religion,
			String admissionNumber, String nationality, List<String> identificationMarks, List<AddressVO> address,ParentGuardianVO parentDetails) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.gender = gender;
		this.dob = dob;
		this.classType = classType;
		this.section = section;
		this.rollNo = rollNo;
		this.admissionDate = admissionDate;
		this.religion = religion;
		this.admissionNumber = admissionNumber;
		this.nationality = nationality;
		this.identificationMarks = identificationMarks;
		this.address = address;
		this.parentDetails=parentDetails;
	}

	@JsonProperty("id")
	public int getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(int id) {
		this.id = id;
	}

	@JsonProperty("firstName")
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

	@JsonProperty("fatherName")
	public String getFatherName() {
		return fatherName;
	}

	@JsonProperty("fatherName")
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	@JsonProperty("motherName")
	public String getMotherName() {
		return motherName;
	}

	@JsonProperty("motherName")
	public void setMotherName(String motherName) {
		this.motherName = motherName;
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

	@JsonProperty("classType")
	public String getClassType() {
		return classType;
	}

	@JsonProperty("classType")
	public void setClassType(String classType) {
		this.classType = classType;
	}

	@JsonProperty("section")
	public String getSection() {
		return section;
	}

	@JsonProperty("section")
	public void setSection(String section) {
		this.section = section;
	}

	@JsonProperty("rollNo")
	public String getRollNo() {
		return rollNo;
	}

	@JsonProperty("rollNo")
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	@JsonProperty("admissionDate")
	public String getAdmissionDate() {
		return admissionDate;
	}

	@JsonProperty("admissionDate")
	public void setAdmissionDate(String admissionDate) {
		this.admissionDate = admissionDate;
	}

	@JsonProperty("religion")
	public String getReligion() {
		return religion;
	}

	@JsonProperty("religion")
	public void setReligion(String religion) {
		this.religion = religion;
	}

	@JsonProperty("admissionNumber")
	public String getAdmissionNumber() {
		return admissionNumber;
	}

	@JsonProperty("admissionNumber")
	public void setAdmissionNumber(String admissionNumber) {
		this.admissionNumber = admissionNumber;
	}

	@JsonProperty("nationality")
	public String getNationality() {
		return nationality;
	}

	@JsonProperty("nationality")
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@JsonProperty("identificationMarks")
	public List<String> getIdentificationMarks() {
		return identificationMarks;
	}

	@JsonProperty("identificationMarks")
	public void setIdentificationMarks(List<String> identificationMarks) {
		this.identificationMarks = identificationMarks;
	}

	@JsonProperty("address")
	public List<AddressVO> getAddress() {
		return address;
	}

	@JsonProperty("address")
	public void setAddress(List<AddressVO> address) {
		this.address = address;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@JsonProperty("parentDetails")
	public ParentGuardianVO getParentDetails() {
		return parentDetails;
	}

	@JsonProperty("parentDetails")
	public void setParentDetails(ParentGuardianVO parentDetails) {
		this.parentDetails = parentDetails;
	}

	/*@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", id).append("firstName", firstName).append("lastName", lastName)
				.append("fatherName", fatherName).append("motherName", motherName).append("gender", gender)
				.append("dob", dob).append("classType", classType).append("section", section).append("rollNo", rollNo)
				.append("admissionDate", admissionDate).append("religion", religion)
				.append("admissionNumber", admissionNumber).append("nationality", nationality)
				.append("identificationMarks", identificationMarks).append("address", address)
				.append("parentDetails",parentDetails)
				.append("additionalProperties", additionalProperties).toString();
	}*/

}