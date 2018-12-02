package com.student.admission.admissiondao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
	public ResponseEntity<StudentVO> createStudent(@RequestBody StudentVO studentVO) {
		StudentVO studentResponseObject = studentService.saveStudentDetails(studentVO);
		return new ResponseEntity<StudentVO>(studentResponseObject, HttpStatus.CREATED);
	}
	
	@GetMapping(value="/person")
	public String checkMethod() {
		return "Hello Venu";
	}
}
