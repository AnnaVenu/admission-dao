package com.student.admission.admissiondao.entity;

import java.sql.Date;
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
	@Column(name = "ID")
	private int id;
	@Column(name = "S_FIRSTNAME")
	private String firstName;
	@Column(name = "S_LASTNAME")
	private String lastName;
	@Column(name = "S_FATHERNAME")
	private String fatherName;
	@Column(name = "S_MOTHERNAME")
	private String motherName;
	@Enumerated(EnumType.STRING)
	@Column(name="S_GENDER")
	private Gender gender;
	@Column(name = "S_DOB")
	private Date dob;
	@Column(name = "S_CLASS")
	private String classType;
	@Column(name = "S_SECTION")
	private String section;
	@Column(name = "S_ROLLNO")
	private String rollNo;
	@Column(name = "S_ADMISSION_DATE")
	private Date admissionDate;
	@Enumerated(EnumType.STRING)
	@Column(name="S_RELIGION")
	private Religion religion;
	@Column(name = "S_ADMISSION_NUMBER")
	private String admissionNumber;
	@Enumerated(EnumType.STRING)
	@Column(name="S_NATIONALITY")
	private Nationality nationality;
	@ElementCollection(targetClass = String.class)
	private List<String> identificationMarks;
	@OneToMany(mappedBy = "student")
	private List<Address> address;
	@Embedded
	@Basic(optional = true)
	@AttributeOverrides({ @AttributeOverride(column = @Column(name = "FIRSTNAME"), name = "firstName"),
			/*@AttributeOverride(column = @Column(name = "FIRSTNAME"), name = "firstName"),*/
			@AttributeOverride(column = @Column(name = "LASTNAME"), name = "lastName"),
			/* @AttributeOverride(column = @Column(name = ""), name = ""), */
			@AttributeOverride(column = @Column(name = "DOB"), name = "dob"),
			@AttributeOverride(column = @Column(name = "CONTACT_DETAILS"), name = "contactDetails") })
	private ParentGuardian parentDetails;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String firstName, String lastName, String fatherName, String motherName, Gender gender,
			Date dob, String classType, String section, String rollNo, Date admissionDate, Religion religion,
			String admissionNumber, Nationality nationality, List<String> identificationMarks, List<Address> address,
			ParentGuardian parentDetails) {
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
		this.parentDetails = parentDetails;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public Gender getGender() {
		return gender;
	}

	public Date getDob() {
		return dob;
	}

	public String getClassType() {
		return classType;
	}

	public String getSection() {
		return section;
	}

	public String getRollNo() {
		return rollNo;
	}

	public Date getAdmissionDate() {
		return admissionDate;
	}

	public Religion getReligion() {
		return religion;
	}

	public String getAdmissionNumber() {
		return admissionNumber;
	}

	public Nationality getNationality() {
		return nationality;
	}

	public List<String> getIdentificationMarks() {
		return identificationMarks;
	}

	public List<Address> getAddress() {
		return address;
	}

	public ParentGuardian getParentDetails() {
		return parentDetails;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}

	public void setReligion(Religion religion) {
		this.religion = religion;
	}

	public void setAdmissionNumber(String admissionNumber) {
		this.admissionNumber = admissionNumber;
	}

	public void setNationality(Nationality nationality) {
		this.nationality = nationality;
	}

	public void setIdentificationMarks(List<String> identificationMarks) {
		this.identificationMarks = identificationMarks;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public void setParentDetails(ParentGuardian parentDetails) {
		this.parentDetails = parentDetails;
	}
}
