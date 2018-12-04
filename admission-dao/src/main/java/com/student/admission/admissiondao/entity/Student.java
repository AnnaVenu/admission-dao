package com.student.admission.admissiondao.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Student {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "S_ID")
	private int sid;
	@Column(name = "S_FIRSTNAME")
	private String sFirstName;
	@Column(name = "S_LASTNAME")
	private String sLastName;
	@Column(name = "S_FATHERNAME")
	private String sFatherName;
	@Column(name = "S_MOTHERNAME")
	private String sMotherName;
	@Enumerated(EnumType.STRING)
	@Column(name = "S_GENDER")
	private Gender sGender;
	@Column(name = "S_DOB")
	private Timestamp sDob;
	@Column(name = "S_CLASS")
	private String sClassType;
	@Column(name = "S_SECTION")
	private String sSection;
	@Column(name = "S_ROLLNO")
	private String sRollNo;
	@Column(name = "S_ADMISSION_DATE")
	private Timestamp sAdmissionDate;
	@Enumerated(EnumType.STRING)
	@Column(name = "S_RELIGION")
	private Religion sReligion;
	@Column(name = "S_ADMISSION_NUMBER")
	private String sAdmissionNumber;
	@Enumerated(EnumType.STRING)
	@Column(name = "S_NATIONALITY")
	private Nationality sNationality;
	@ElementCollection(targetClass = String.class)
	private List<String> identificationMarks;
	@OneToMany(mappedBy = "student")
	private List<Address> sAddress;
	@Embedded
	@Basic(optional = true)
	@AttributeOverrides({ @AttributeOverride(column = @Column(name = "P_FIRSTNAME"), name = "pFirstName"),
			@AttributeOverride(column = @Column(name = "P_LASTNAME"), name = "pLastName"),
			 @AttributeOverride(column = @Column(name = "P_GENDER"), name = "pGender"), 
			@AttributeOverride(column = @Column(name = "P_PARENT_DOB"), name = "pDob"),
			@AttributeOverride(column = @Column(name = "P_CONTACT_DETAILS"), name = "pContactDetails") })
	private ParentGuardian parentDetails;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int sid, String sFirstName, String sLastName, String sFatherName, String sMotherName, Gender sGender,
			Timestamp sDob, String sClassType, String sSection, String sRollNo, Timestamp sAdmissionDate,
			Religion sReligion, String sAdmissionNumber, Nationality sNationality, List<String> identificationMarks,
			List<Address> sAddress, ParentGuardian parentDetails) {
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
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getsFirstName() {
		return sFirstName;
	}

	public void setsFirstName(String sFirstName) {
		this.sFirstName = sFirstName;
	}

	public String getsLastName() {
		return sLastName;
	}

	public void setsLastName(String sLastName) {
		this.sLastName = sLastName;
	}

	public String getsFatherName() {
		return sFatherName;
	}

	public void setsFatherName(String sFatherName) {
		this.sFatherName = sFatherName;
	}

	public String getsMotherName() {
		return sMotherName;
	}

	public void setsMotherName(String sMotherName) {
		this.sMotherName = sMotherName;
	}

	public Gender getsGender() {
		return sGender;
	}

	public void setsGender(Gender sGender) {
		this.sGender = sGender;
	}

	public Timestamp getsDob() {
		return sDob;
	}

	public void setsDob(Timestamp sDob) {
		this.sDob = sDob;
	}

	public String getsClassType() {
		return sClassType;
	}

	public void setsClassType(String sClassType) {
		this.sClassType = sClassType;
	}

	public String getsSection() {
		return sSection;
	}

	public void setsSection(String sSection) {
		this.sSection = sSection;
	}

	public String getsRollNo() {
		return sRollNo;
	}

	public void setsRollNo(String sRollNo) {
		this.sRollNo = sRollNo;
	}

	public Timestamp getsAdmissionDate() {
		return sAdmissionDate;
	}

	public void setsAdmissionDate(Timestamp sAdmissionDate) {
		this.sAdmissionDate = sAdmissionDate;
	}

	public Religion getsReligion() {
		return sReligion;
	}

	public void setsReligion(Religion sReligion) {
		this.sReligion = sReligion;
	}

	public String getsAdmissionNumber() {
		return sAdmissionNumber;
	}

	public void setsAdmissionNumber(String sAdmissionNumber) {
		this.sAdmissionNumber = sAdmissionNumber;
	}

	public Nationality getsNationality() {
		return sNationality;
	}

	public void setsNationality(Nationality sNationality) {
		this.sNationality = sNationality;
	}

	public List<String> getIdentificationMarks() {
		return identificationMarks;
	}

	public void setIdentificationMarks(List<String> identificationMarks) {
		this.identificationMarks = identificationMarks;
	}

	public List<Address> getsAddress() {
		return sAddress;
	}

	public void setsAddress(List<Address> sAddress) {
		this.sAddress = sAddress;
	}

	public ParentGuardian getParentDetails() {
		return parentDetails;
	}

	public void setParentDetails(ParentGuardian parentDetails) {
		this.parentDetails = parentDetails;
	}

}
