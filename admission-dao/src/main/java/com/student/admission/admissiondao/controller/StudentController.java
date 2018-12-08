package com.student.admission.admissiondao.controller;

import javax.validation.Valid;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.admission.admissiondao.service.StudentService;
import com.student.admission.admissiondao.vo.StudentVO;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

	@Autowired
	StudentService studentService;

	@PostMapping(value = "/saveStudentDetails")
	public ResponseEntity<StudentVO> createStudent(@Valid @RequestBody StudentVO studentVO) {
		StudentVO studentResponseObject = studentService.saveStudentDetails(studentVO);
		return new ResponseEntity<StudentVO>(studentResponseObject, HttpStatus.CREATED);
	}

	@GetMapping(value = "/getByRollNo/{sRollNo}")
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseEntity<StudentVO> getByRollNo(@PathVariable("sRollNo") String sRollNo) {
		StudentVO studentResponseObject = studentService.getByRollNoStudentDetails(sRollNo);
		return new ResponseEntity<StudentVO>(studentResponseObject, HttpStatus.ACCEPTED);
	}

	@GetMapping(value = "/person")
	public String checkMethod() {
		return "Hello Venu";
	}
}
