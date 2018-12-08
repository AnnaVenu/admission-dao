package com.student.admission.admissiondao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.student.admission.admissiondao.entity.Student;
import com.student.admission.admissiondao.mapper.AdminDAOMapper;
import com.student.admission.admissiondao.repository.StudentRepository;
import com.student.admission.admissiondao.vo.StudentVO;

@Service
@EnableTransactionManagement
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Autowired
	AdminDAOMapper adminDAOMapper;

	@Override
	public StudentVO saveStudentDetails(StudentVO studentVO) {
		Student studentEntity = adminDAOMapper.voToEntity(studentVO);
		Student studentDbEntity = studentRepository.save(studentEntity);
		StudentVO responseObject = adminDAOMapper.entityToVo(studentDbEntity);
		return responseObject;
	}

	@Override
	public StudentVO getByRollNoStudentDetails(String sRollNo) {
     Student studentEntity = studentRepository.getByRollNo(sRollNo);
     StudentVO studentVO = adminDAOMapper.entityToVo(studentEntity);
		return studentVO;
	}

}
