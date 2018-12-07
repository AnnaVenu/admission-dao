package com.student.admission.admissiondao.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.student.admission.admissiondao.entity.Address;

public class Test {
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {

		ArrayList<Address> addressList = new ArrayList<Address>();
		Address address = new Address();
		address.setDistrict("KNR");
		address.setDoorNumber("8-36");
		address.setId(1);
		address.setsRollNo("1234");
		address.setState("TS");
		address.setStreetName("PDPL");
		address.setZipCode("505474");
		addressList.add(address);

		Address address2 = new Address();
		address2.setDistrict("KNR1");
		address2.setDoorNumber("8-361");
		address2.setId(11);
		address2.setsRollNo("12314");
		address2.setState("TS1");
		address2.setStreetName("PDPL1");
		address2.setZipCode("5054741");
		addressList.add(address2);
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("C:\\Users\\693588\\Desktop\\result.json"), addressList);

	}
}