package com.student.admission.admissiondao.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import com.student.admission.admissiondao.entity.Student;
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
			/*@Mapping(target = "parentDetails.pDob", expression = "java(com.student.admission.admissiondao.utils.DateConvertor.stringToDateConverter(studentVO.getParentDetails().getpDob()))"),*/
			@Mapping(target = "sAddress", source = "studentVO.sAddress"),
			@Mapping(target = "identificationMarks", source = "studentVO.identificationMarks")

	})
	Student voToEntity(StudentVO studentVO);

	@Mappings({ @Mapping(target = "sid", source = "student.sid"),
			@Mapping(target = "sFirstName", source = "student.sFirstName"),
			@Mapping(target = "sLastName", source = "student.sLastName"),
			@Mapping(target = "sFatherName", source = "student.sFatherName"),
			@Mapping(target = "sMotherName", source = "student.sMotherName"),
			@Mapping(target = "sGender", source = "student.sGender"),
			@Mapping(target = "sDob", expression = "java(com.student.admission.admissiondao.utils.DateConvertor.datetoStringConverter(student.getsDob()))"),
			@Mapping(target = "sClassType", source = "student.sClassType"),
			@Mapping(target = "sSection", source = "student.sSection"),
			@Mapping(target = "sRollNo", source = "student.sRollNo"),
			@Mapping(target = "sAdmissionDate", expression = "java(com.student.admission.admissiondao.utils.DateConvertor.datetoStringConverter(student.getsAdmissionDate()))"),
			@Mapping(target = "sReligion", source = "student.sReligion"),
			@Mapping(target = "sAdmissionNumber", source = "student.sAdmissionNumber"),
			@Mapping(target = "sNationality", source = "student.sNationality"),
			@Mapping(target = "sAddress", source = "student.sAddress"),
			/*@Mapping(target="parentDetails.pDob" ,expression="java(com.student.admission.admissiondao.utils.DateConvertor.datetoStringConverter(student.getParentDetails().getpDob()))"),*/
			@Mapping(target = "identificationMarks", source = "student.identificationMarks") })
	StudentVO entityToVo(Student student);

}

/*
 * @Mapping(target = "parentDetails.pContactDetails", expression =
 * "java((studentVO.getParentDetails().pContactDetails()))"),
 */ // .toString()
/*
 * @Mapping(target = "parentDetails.pFirstName", expression =
 * "java((studentVO.getParentDetails().getpFirstName()))"),
 * 
 * @Mapping(target = "parentDetails.pLastName", expression =
 * "java((studentVO.getParentDetails().getpLastName()))"),
 * 
 * @Mapping(target = "parentDetails.pGender", expression =
 * "java((studentVO.getParentDetails().getpGender()))"),
 */

/*
 * @Mapping(target = "parentDetails.pFirstName", expression =
 * "java((student.getParentDetails().getpFirstName()))"),
 * 
 * @Mapping(target = "parentDetails.pLastName", expression =
 * "java((student.getParentDetails().getpLastName()))"),
 * 
 * @Mapping(target = "parentDetails.pGender", expression =
 * "java((student.getParentDetails().getpGender()))"),
 */
/* @Mapping(target = "parentDetails.pDob", source=), */
/*
 * @Mapping(target = "parentDetails", expression =
 * "java((student.getParentDetails().pContactDetails()))"),
 */// .toString()
/*
 * expression = "java(com.student.admission.admissiondao.utils.DateConvertor.
 * stringToDateConverter(studentVO.getParentDetails(),parentDetails.getpDob()))
 */