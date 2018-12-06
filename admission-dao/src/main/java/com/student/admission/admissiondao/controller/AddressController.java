package com.student.admission.admissiondao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.admission.admissiondao.service.AddressService;
import com.student.admission.admissiondao.vo.AddressVO;

@RestController
@RequestMapping(value = "/student")
public class AddressController {

	@Autowired
	AddressService addressService;

	@PostMapping(value = "/addressData")
	public ResponseEntity<List<AddressVO>> saveStudentAddress(@RequestBody List<AddressVO> addressVO) {
		List<AddressVO> addressResponseObject = addressService.saveAddress(addressVO);
		return new ResponseEntity<List<AddressVO>>(addressResponseObject, HttpStatus.CREATED);
	}

	@GetMapping(value = "/address")
	public String checkMethod() {
		return "Hello Venu";
	}
}
