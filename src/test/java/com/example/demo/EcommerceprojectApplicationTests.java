package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.project.EcommerceprojectApplication;

@SpringBootTest(
		classes = EcommerceprojectApplication.class,
		properties = {
				"spring.datasource.url=jdbc:h2:mem:eproject;MODE=MySQL",
				"spring.datasource.username=sa",
				"spring.datasource.password=",
				"spring.jpa.database-platform=org.hibernate.dialect.H2Dialect",
				"spring.jpa.hibernate.ddl-auto=none"
		})
class EcommerceprojectApplicationTests {

	@Test
	void contextLoads() {
	}

}
