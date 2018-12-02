package com.student.admission.admissiondao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ADDRESS")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "AID")
	private int id;
	@Column(name = "DOOR_NUMBER")
	private String doorNumber;
	@Column(name = "STREET_NAME")
	private String streetName;
	@Column(name = "DISTRICT")
	private String district;
	@Column(name = "STATE")
	private String state;
	@Column(name = "ZIPCODE")
	private String zipCode;
	@ManyToOne
	@JoinColumn(name = "ID", nullable = false)
	private Student student;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int id, String doorNumber, String streetName, String district, String state, String zipCode,
			Student student) {
		super();
		this.id = id;
		this.doorNumber = doorNumber;
		this.streetName = streetName;
		this.district = district;
		this.state = state;
		this.zipCode = zipCode;
		this.student = student;
	}

	public int getId() {
		return id;
	}

	public String getDoorNumber() {
		return doorNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public String getDistrict() {
		return district;
	}

	public String getState() {
		return state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public Student getStudent() {
		return student;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
}
