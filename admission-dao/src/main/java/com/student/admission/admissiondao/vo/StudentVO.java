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
@JsonPropertyOrder({ "sid", "sFirstName", "sLastName", "sFatherName", "sMotherName", "sGender", "sDob", "sClassType",
		"sSection", "sRollNo", "sAdmissionDate", "sReligion", "sAdmissionNumber", "sNationality", "identificationMarks",
		"sAddress", "parentDetails" })
public class StudentVO implements Serializable {

	@JsonProperty("sid")
	private int sid;
	@JsonProperty("sFirstName")
	private String sFirstName;
	@JsonProperty("sLastName")
	private String sLastName;
	@JsonProperty("sFatherName")
	private String sFatherName;
	@JsonProperty("sMotherName")
	private String sMotherName;
	@JsonProperty("sGender")
	private String sGender;
	@JsonProperty("sDob")
	private String sDob;
	@JsonProperty("sClassType")
	private String sClassType;
	@JsonProperty("sSection")
	private String sSection;
	@JsonProperty("sRollNo")
	private String sRollNo;
	@JsonProperty("sAdmissionDate")
	private String sAdmissionDate;
	@JsonProperty("sReligion")
	private String sReligion;
	@JsonProperty("sAdmissionNumber")
	private String sAdmissionNumber;
	@JsonProperty("sNationality")
	private String sNationality;
	@JsonProperty("identificationMarks")
	private List<String> identificationMarks = null;
	@JsonProperty("sAddress")
	private List<AddressVO> sAddress = null;
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
	public StudentVO(int sid, String sFirstName, String sLastName, String sFatherName, String sMotherName,
			String sGender, String sDob, String sClassType, String sSection, String sRollNo, String sAdmissionDate,
			String sReligion, String sAdmissionNumber, String sNationality, List<String> identificationMarks,
			List<AddressVO> sAddress, ParentGuardianVO parentDetails, Map<String, Object> additionalProperties) {
		super();
		this.sid = sid;
		this.sFirstName = sFirstName;
		this.sLastName = sLastName;
		this.sFatherName = sFatherName;
		this.sMotherName = sMotherName;
		this.sGender = sGender;
		this.sDob = sDob;
		this.sClassType = sClassType;
		this.sSection = sSection;
		this.sRollNo = sRollNo;
		this.sAdmissionDate = sAdmissionDate;
		this.sReligion = sReligion;
		this.sAdmissionNumber = sAdmissionNumber;
		this.sNationality = sNationality;
		this.identificationMarks = identificationMarks;
		this.sAddress = sAddress;
		this.parentDetails = parentDetails;
		this.additionalProperties = additionalProperties;
	}

	@JsonProperty("sid")
	public int getSid() {
		return sid;
	}

	@JsonProperty("sid")
	public void setSid(int sid) {
		this.sid = sid;
	}

	@JsonProperty("sFirstName")
	public String getsFirstName() {
		return sFirstName;
	}

	@JsonProperty("sFirstName")
	public void setsFirstName(String sFirstName) {
		this.sFirstName = sFirstName;
	}

	@JsonProperty("sLastName")
	public String getsLastName() {
		return sLastName;
	}

	@JsonProperty("sLastName")
	public void setsLastName(String sLastName) {
		this.sLastName = sLastName;
	}

	@JsonProperty("sFatherName")
	public String getsFatherName() {
		return sFatherName;
	}

	@JsonProperty("sFatherName")
	public void setsFatherName(String sFatherName) {
		this.sFatherName = sFatherName;
	}

	@JsonProperty("sMotherName")
	public String getsMotherName() {
		return sMotherName;
	}

	@JsonProperty("sMotherName")
	public void setsMotherName(String sMotherName) {
		this.sMotherName = sMotherName;
	}

	@JsonProperty("sGender")
	public String getsGender() {
		return sGender;
	}

	@JsonProperty("sGender")
	public void setsGender(String sGender) {
		this.sGender = sGender;
	}

	@JsonProperty("sDob")
	public String getsDob() {
		return sDob;
	}

	@JsonProperty("sDob")
	public void setsDob(String sDob) {
		this.sDob = sDob;
	}

	@JsonProperty("sClassType")
	public String getsClassType() {
		return sClassType;
	}

	@JsonProperty("sClassType")
	public void setsClassType(String sClassType) {
		this.sClassType = sClassType;
	}

	@JsonProperty("sSection")
	public String getsSection() {
		return sSection;
	}

	@JsonProperty("sSection")
	public void setsSection(String sSection) {
		this.sSection = sSection;
	}

	@JsonProperty("sRollNo")
	public String getsRollNo() {
		return sRollNo;
	}

	@JsonProperty("sRollNo")
	public void setsRollNo(String sRollNo) {
		this.sRollNo = sRollNo;
	}

	@JsonProperty("sAdmissionDate")
	public String getsAdmissionDate() {
		return sAdmissionDate;
	}

	@JsonProperty("sAdmissionDate")
	public void setsAdmissionDate(String sAdmissionDate) {
		this.sAdmissionDate = sAdmissionDate;
	}

	@JsonProperty("sReligion")
	public String getsReligion() {
		return sReligion;
	}

	@JsonProperty("sReligion")
	public void setsReligion(String sReligion) {
		this.sReligion = sReligion;
	}

	@JsonProperty("sAdmissionNumber")
	public String getsAdmissionNumber() {
		return sAdmissionNumber;
	}

	@JsonProperty("sAdmissionNumber")
	public void setsAdmissionNumber(String sAdmissionNumber) {
		this.sAdmissionNumber = sAdmissionNumber;
	}

	@JsonProperty("sNationality")
	public String getsNationality() {
		return sNationality;
	}

	@JsonProperty("sNationality")
	public void setsNationality(String sNationality) {
		this.sNationality = sNationality;
	}

	@JsonProperty("identificationMarks")
	public List<String> getIdentificationMarks() {
		return identificationMarks;
	}

	@JsonProperty("identificationMarks")
	public void setIdentificationMarks(List<String> identificationMarks) {
		this.identificationMarks = identificationMarks;
	}

	@JsonProperty("sAddress")
	public List<AddressVO> getsAddress() {
		return sAddress;
	}

	@JsonProperty("sAddress")
	public void setsAddress(List<AddressVO> sAddress) {
		this.sAddress = sAddress;
	}

	@JsonProperty("parentDetails")
	public ParentGuardianVO getParentDetails() {
		return parentDetails;
	}

	@JsonProperty("parentDetails")
	public void setParentDetails(ParentGuardianVO parentDetails) {
		this.parentDetails = parentDetails;
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
		return "StudentVO [sid=" + sid + ", sFirstName=" + sFirstName + ", sLastName=" + sLastName + ", sFatherName="
				+ sFatherName + ", sMotherName=" + sMotherName + ", sGender=" + sGender + ", sDob=" + sDob
				+ ", sClassType=" + sClassType + ", sSection=" + sSection + ", sRollNo=" + sRollNo + ", sAdmissionDate="
				+ sAdmissionDate + ", sReligion=" + sReligion + ", sAdmissionNumber=" + sAdmissionNumber
				+ ", sNationality=" + sNationality + ", identificationMarks=" + identificationMarks + ", sAddress="
				+ sAddress + ", parentDetails=" + parentDetails + ", additionalProperties=" + additionalProperties
				+ "]";
	}

	/*@Override
	public String toString() {
		return new ToStringBuilder(this).append("sid", sid).append("sFirstName", sFirstName)
				.append("sLastName", sLastName).append("sFatherName", sFatherName).append("sMotherName", sMotherName)
				.append("sGender", sGender).append("sDob", sDob).append("sClassType", sClassType)
				.append("sAdmissionDate", sAdmissionDate).append("sRollNo", sRollNo)
				.append("sAdmissionDate", sAdmissionDate).append("sReligion", sReligion)
				.append("sAdmissionNumber", sAdmissionNumber).append("nationality", sNationality)
				.append("identificationMarks", identificationMarks).append("sAddress", sAddress)
				.append("parentDetails", parentDetails).append("additionalProperties", additionalProperties).toString();
	}*/
	

}