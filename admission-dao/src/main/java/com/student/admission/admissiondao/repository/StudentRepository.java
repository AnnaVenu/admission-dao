package com.student.admission.admissiondao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.student.admission.admissiondao.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	@Query("SELECT s FROM Student s where s.sRollNo=:sRollNo")
	Student getByRollNo(@Param("sRollNo") String sRollNo);

}
