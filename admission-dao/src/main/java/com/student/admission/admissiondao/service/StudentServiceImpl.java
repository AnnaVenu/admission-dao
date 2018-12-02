package com.student.admission.admissiondao.service;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.admission.admissiondao.entity.Student;
import com.student.admission.admissiondao.mapper.StudentMapper;
import com.student.admission.admissiondao.repository.StudentRepository;
import com.student.admission.admissiondao.vo.StudentVO;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private final StudentMapper studentMapper;

	 public StudentServiceImpl() {
		// TODO Auto-generated constructor stub
		studentMapper = Mappers.getMapper(StudentMapper.class);
	}

	@Autowired
	StudentRepository studentRepository;

	@Override
	public StudentVO saveStudentDetails(StudentVO studentVO) {
		Student studentEntity = studentMapper.voToEntity(studentVO);
		Student studentResponseObject = studentRepository.save(studentEntity);
		StudentVO studentResponseVo = studentMapper.entityToVo(studentResponseObject);
		return studentResponseVo;
	}
}
