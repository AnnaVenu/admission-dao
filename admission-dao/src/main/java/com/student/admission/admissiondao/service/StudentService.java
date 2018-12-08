package com.student.admission.admissiondao.service;

import com.student.admission.admissiondao.vo.StudentVO;

public interface StudentService {

	StudentVO saveStudentDetails(StudentVO studentVO);

	StudentVO getByRollNoStudentDetails(String sRollNo);

}
