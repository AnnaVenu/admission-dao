package com.student.admission.admissiondao.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import com.student.admission.admissiondao.entity.Student;
import com.student.admission.admissiondao.vo.ParentGuardianVO;
import com.student.admission.admissiondao.vo.StudentVO;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StudentMapper {

	public static StudentMapper STUDENT_MAPPER = Mappers.getMapper(StudentMapper.class);

	@Mappings({ @Mapping(target = "sFirstName", source = "studentVO.sFirstName"),
			@Mapping(target = "sLastName", source = "studentVO.sLastName"),
			@Mapping(target = "sFatherName", source = "studentVO.sFatherName"),
			@Mapping(target = "sMotherName", source = "studentVO.sMotherName"),
			@Mapping(target = "sGender", source = "studentVO.sGender"),
			@Mapping(target = "sDob", expression = "java(com.student.admission.admissiondao.utils.DateConvertor.stringToDateConverter(studentVO.getsDob()))"),
			@Mapping(target = "sClassType", source = "studentVO.sClassType"),
			@Mapping(target = "sSection", source = "studentVO.sSection"),
			@Mapping(target = "sRollNo", source = "studentVO.sRollNo"),
			@Mapping(target = "sAdmissionDate", expression = "java(com.student.admission.admissiondao.utils.DateConvertor.stringToDateConverter(studentVO.getsAdmissionDate()))"),
			@Mapping(target = "sReligion", source = "studentVO.sReligion"),
			@Mapping(target = "sAdmissionNumber", source = "studentVO.sAdmissionNumber"),
			@Mapping(target = "sNationality", source = "studentVO.sNationality"),
			@Mapping(target = "parentDetails", expression = "java(studentVO.getParentDetails())"),//.toString()
			@Mapping(target = "sAddress" , source="studentVO.sAddress"),
			@Mapping(target = "identificationMarks" , source="studentVO.identificationMarks")
			// List of String identification and address &parent class details

	})
	Student voToEntity(StudentVO studentVO);

	StudentVO entityToVo(Student student);

	/*
	 * List<Student> voListToEntity(List<StudentVO> studentVO);
	 * 
	 * List<StudentVO> entityListToVo(List<Student> student);
	 */

}

/*
 * @Mappings({
 * 
 * @Mapping(target = "sDob", expression =
 * "java(com.student.admission.admissiondao.utils.DateConvertor.stringToDateConverter(studentVO.getsDob()))"
 * ),
 * 
 * @Mapping(target = "sAdmissionDate", expression =
 * "java(com.student.admission.admissiondao.utils.DateConvertor.stringToDateConverter(studentVO.getsAdmissionDate()))")
 * })
 * 
 * @Mappings({
 * 
 * @Mapping(target = "parentGuardianVO.pdob", expression =
 * "java(com.student.admission.admissiondao.utils.DateConvertor.stringToDateConverter(parentGuardianVO.getPdob()))")
 * })
 */