package com.student.admission.admissiondao.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "ADDRESS")
@DynamicUpdate
public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	/*
	 * @SequenceGenerator(name = "native")
	 * 
	 * @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	 */
	/* @GenericGenerator(name = "native", strategy = "native") */
	@Column(name = "AID", updatable = false, nullable = false)
	private int id;
	@Column(name = "S_ROLLNO", insertable = false, updatable = false)
	private String sRollNo;
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
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "S_ROLLNO", referencedColumnName = "S_ROLLNO")
	private Student studentMap;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int id, String sRollNo, String doorNumber, String streetName, String district, String state,
			String zipCode, Student studentMap) {
		super();
		this.id = id;
		this.sRollNo = sRollNo;
		this.doorNumber = doorNumber;
		this.streetName = streetName;
		this.district = district;
		this.state = state;
		this.zipCode = zipCode;
		this.studentMap = studentMap;
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

	public void setId(int id) {
		this.id = id;
	}

	public String getsRollNo() {
		return sRollNo;
	}

	public void setsRollNo(String sRollNo) {
		this.sRollNo = sRollNo;
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

	public Student getStudentMap() {
		return studentMap;
	}

	public void setStudentMap(Student studentMap) {
		this.studentMap = studentMap;
	}
}
