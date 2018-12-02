package com.student.admission.admissiondao.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.student.admission.admissiondao.entity.Student;
import com.student.admission.admissiondao.vo.StudentVO;

@Mapper(componentModel = "spring")
public interface StudentMapper {
	

	@Mappings({ @Mapping(target = "id", source = "studentVO.id"),
			@Mapping(target = "firstName", source = "studentVO.firstName") })
	Student voToEntity(StudentVO studentVO);

	StudentVO entityToVo(Student student);
}
