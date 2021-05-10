package com.courierCompany.com.project.courierCompany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * @author 
 * @since  2021-05-04
 * */

/**
 * Date : 2021-05-04
 * 
 * @author AysegulBulur
 * @version 1.0
 */
@SpringBootApplication
public class Application {
	
	/*
	 * SpringApplication.run starts Tomcat
	 * @param args array of string arguments
	 * */

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
