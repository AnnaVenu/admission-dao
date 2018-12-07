package com.student.admission.admissiondao.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import com.student.admission.admissiondao.entity.Address;
import com.student.admission.admissiondao.entity.Student;
import com.student.admission.admissiondao.vo.AddressVO;
import com.student.admission.admissiondao.vo.StudentVO;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AdminDAOMapper {

	public static AdminDAOMapper STUDENT_MAPPER = Mappers.getMapper(AdminDAOMapper.class);

	@Mappings({
			@Mapping(target = "sDob", expression = "java(com.student.admission.admissiondao.utils.DateConvertor.stringToDateConverter(studentVO.getsDob()))"),
			@Mapping(target = "sAdmissionDate", expression = "java(com.student.admission.admissiondao.utils.DateConvertor.stringToDateConverter(studentVO.getsAdmissionDate()))") })
	Student voToEntity(StudentVO studentVO);

	@Mappings({
			@Mapping(target = "sDob", expression = "java(com.student.admission.admissiondao.utils.DateConvertor.datetoStringConverter(student.getsDob()))"),
			@Mapping(target = "sAdmissionDate", expression = "java(com.student.admission.admissiondao.utils.DateConvertor.datetoStringConverter(student.getsAdmissionDate()))") })
	StudentVO entityToVo(Student student);
	
	@Mappings({
		@Mapping(source="addressVO.sRollNo",target="studentMap.sRollNo"),
		@Mapping(target="sRollNo",ignore=true)
	})
	Address addressVoToEntity(AddressVO addressVO);

	List<Address> addressVoToEntity(List<AddressVO> addressVO);

	List<AddressVO> addressEntityToVo(List<Address> address);

	List<Student> listOfVoToEntity(List<StudentVO> liststudentVO);

	List<StudentVO> listOfEntityToVo(List<Student> listStudent);

}
