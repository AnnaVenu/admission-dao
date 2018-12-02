package com.student.admission.admissiondao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EntityScan("com.student.admission.admissiondao.entity")
@ComponentScan(basePackages = "com.student.admission.admissiondao")
//@EnableJpaRepositories("com.delivery.repository")
/*@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })*/
public class AdmissionDaoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(AdmissionDaoApplication.class, args);
	}
}
